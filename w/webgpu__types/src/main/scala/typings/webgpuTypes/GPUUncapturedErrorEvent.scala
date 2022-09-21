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
    * Object representing the error that was uncaptured.
    * This has the same type as errors returned by {@link GPUDevice#popErrorScope}.
    * This attribute is backed by an immutable internal slot of the same name, and
    * always returns its value.
    * Issue(whatwg/webidl#1077): This attribute should be `[SameObject]`.
    * (If GPUError [becomes an interface](https://github.com/gpuweb/gpuweb/issues/1884) then
    * we can do this without resolving the WebIDL issue.)
    */
  val error: GPUError = js.native
}
