package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {getNumOfLabels (): std.Promise<number>, getLabels (delimiter : string | undefined): std.Promise<std.Array<string>>, getLabelAt (index : number, delimiter : string | undefined): std.Promise<string>} & std.Pick<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> & wix-ui-test-utils.wix-ui-test-utils/base-driver.BaseUniDriver */
@js.native
trait getNumOfLabelsPromisenumb extends StObject {
  
  /** click on the element */
  def click(): js.Promise[Unit] = js.native
  
  var driver: IsDisabled = js.native
  
  /** returns the component element */
  def element(): js.Promise[Any] = js.native
  
  /** returns true if component exists */
  def exists(): js.Promise[Boolean] = js.native
  
  def getLabelAt(index: Double): js.Promise[String] = js.native
  def getLabelAt(index: Double, delimiter: String): js.Promise[String] = js.native
  
  def getLabels(): js.Promise[js.Array[String]] = js.native
  def getLabels(delimiter: String): js.Promise[js.Array[String]] = js.native
  
  def getNumOfLabels(): js.Promise[Double] = js.native
}
