package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TestRunRequest")
@js.native
/**
  * @param include Array of specific tests to run, or undefined to run all tests
  * @param exclude An array of tests to exclude from the run.
  * @param profile The run profile used for this request.
  */
open class TestRunRequest () extends StObject {
  def this(include: js.Array[TestItem]) = this()
  def this(include: js.Array[TestItem], exclude: js.Array[TestItem]) = this()
  def this(include: Unit, exclude: js.Array[TestItem]) = this()
  def this(include: js.Array[TestItem], exclude: js.Array[TestItem], profile: TestRunProfile) = this()
  def this(include: js.Array[TestItem], exclude: Unit, profile: TestRunProfile) = this()
  def this(include: Unit, exclude: js.Array[TestItem], profile: TestRunProfile) = this()
  def this(include: Unit, exclude: Unit, profile: TestRunProfile) = this()
  
  /**
    * An array of tests the user has marked as excluded from the test included
    * in this run; exclusions should apply after inclusions.
    *
    * May be omitted if no exclusions were requested. Test controllers should
    * not run excluded tests or any children of excluded tests.
    */
  val exclude: js.UndefOr[js.Array[TestItem]] = js.native
  
  /**
    * A filter for specific tests to run. If given, the extension should run
    * all of the included tests and all their children, excluding any tests
    * that appear in {@link TestRunRequest.exclude}. If this property is
    * undefined, then the extension should simply run all tests.
    *
    * The process of running tests should resolve the children of any test
    * items who have not yet been resolved.
    */
  val include: js.UndefOr[js.Array[TestItem]] = js.native
  
  /**
    * The profile used for this request. This will always be defined
    * for requests issued from the editor UI, though extensions may
    * programmatically create requests not associated with any profile.
    */
  val profile: js.UndefOr[TestRunProfile] = js.native
}
