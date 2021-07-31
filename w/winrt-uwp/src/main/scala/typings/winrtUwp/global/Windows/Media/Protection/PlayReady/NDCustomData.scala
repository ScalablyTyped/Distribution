package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCustomData")
@js.native
class NDCustomData protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.NDCustomData {
  /**
    * Creates a new instance of the NDCustomData class.
    * @param customDataTypeIDBytes The type identifier for the custom data. Only a type identifier that is exactly 16 bytes in size is supported.
    * @param customDataBytes The custom data.
    */
  def this(customDataTypeIDBytes: js.Array[Double], customDataBytes: js.Array[Double]) = this()
  
  /** Gets the custom data. */
  /* CompleteClass */
  var customData: Double = js.native
  
  /** Gets the 16-byte type identifier for the custom data. */
  /* CompleteClass */
  var customDataTypeID: Double = js.native
}
