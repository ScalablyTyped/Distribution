package typings.v8Callsites

import typings.callsite.mod.CallSite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Captures a specific callstack.
    *
    * @param origin
    * The method to start to record.
    *
    * @returns
    * The captured callstack.
    */
  inline def apply(): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[CallSite]]
  /**
    * Captures a specific callstack.
    *
    * @param frames
    * The number of frames to capture.
    *
    * @param origin
    * The method to start to record.
    *
    * @returns
    * The captured callstack.
    */
  inline def apply(frames: Double, origin: js.Function1[/* repeated */ Any, Any]): js.Array[CallSite] = (^.asInstanceOf[js.Dynamic].apply(frames.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[js.Array[CallSite]]
  inline def apply(origin: js.Function1[/* repeated */ Any, Any]): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].apply(origin.asInstanceOf[js.Any]).asInstanceOf[js.Array[CallSite]]
  
  @JSImport("v8-callsites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
