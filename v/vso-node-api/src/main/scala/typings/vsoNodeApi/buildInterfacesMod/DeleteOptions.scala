package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeleteOptions extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DeleteOptions")
@js.native
object DeleteOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeleteOptions with Double] = js.native
  
  /**
    * All data should be deleted.
    */
  @js.native
  sealed trait All extends DeleteOptions
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * The build should be deleted.
    */
  @js.native
  sealed trait Details extends DeleteOptions
  /* 8 */ @js.native
  object Details extends TopLevel[Details with Double]
  
  /**
    * The drop location should be deleted.
    */
  @js.native
  sealed trait DropLocation extends DeleteOptions
  /* 1 */ @js.native
  object DropLocation extends TopLevel[DropLocation with Double]
  
  /**
    * The version control label should be deleted.
    */
  @js.native
  sealed trait Label extends DeleteOptions
  /* 4 */ @js.native
  object Label extends TopLevel[Label with Double]
  
  /**
    * No data should be deleted. This value should not be used.
    */
  @js.native
  sealed trait None extends DeleteOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Published symbols should be deleted.
    */
  @js.native
  sealed trait Symbols extends DeleteOptions
  /* 16 */ @js.native
  object Symbols extends TopLevel[Symbols with Double]
  
  /**
    * The test results should be deleted.
    */
  @js.native
  sealed trait TestResults extends DeleteOptions
  /* 2 */ @js.native
  object TestResults extends TopLevel[TestResults with Double]
}
