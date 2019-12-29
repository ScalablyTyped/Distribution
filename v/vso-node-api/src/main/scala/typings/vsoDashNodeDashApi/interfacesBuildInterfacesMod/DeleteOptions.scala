package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeleteOptions extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DeleteOptions")
@js.native
object DeleteOptions extends js.Object {
  /**
    * All data should be deleted.
    */
  @js.native
  sealed trait All extends DeleteOptions
  
  /**
    * The build should be deleted.
    */
  @js.native
  sealed trait Details extends DeleteOptions
  
  /**
    * The drop location should be deleted.
    */
  @js.native
  sealed trait DropLocation extends DeleteOptions
  
  /**
    * The version control label should be deleted.
    */
  @js.native
  sealed trait Label extends DeleteOptions
  
  /**
    * No data should be deleted. This value should not be used.
    */
  @js.native
  sealed trait None extends DeleteOptions
  
  /**
    * Published symbols should be deleted.
    */
  @js.native
  sealed trait Symbols extends DeleteOptions
  
  /**
    * The test results should be deleted.
    */
  @js.native
  sealed trait TestResults extends DeleteOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeleteOptions with Double] = js.native
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 8 */ @js.native
  object Details extends TopLevel[Details with Double]
  
  /* 1 */ @js.native
  object DropLocation extends TopLevel[DropLocation with Double]
  
  /* 4 */ @js.native
  object Label extends TopLevel[Label with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Symbols extends TopLevel[Symbols with Double]
  
  /* 2 */ @js.native
  object TestResults extends TopLevel[TestResults with Double]
  
}

