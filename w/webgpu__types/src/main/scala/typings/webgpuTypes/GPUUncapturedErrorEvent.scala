package typings.webgpuTypes

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUUncapturedErrorEvent
  extends StObject
     with Event {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUUncapturedErrorEvent = js.native
  
  /**
    * A slot-backed attribute holding an object representing the error that was uncaptured.
    * This has the same type as errors returned by {@link GPUDevice#popErrorScope}.
    */
  val error: GPUError = js.native
}
