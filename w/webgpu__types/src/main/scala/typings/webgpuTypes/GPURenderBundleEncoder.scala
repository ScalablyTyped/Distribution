package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderBundleEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin
     with GPURenderCommandsMixin {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPURenderBundleEncoder = js.native
  
  /**
    * Completes recording of the render bundle commands sequence.
    * 	descriptor:
    */
  def finish(): GPURenderBundle = js.native
  def finish(descriptor: GPURenderBundleDescriptor): GPURenderBundle = js.native
}
