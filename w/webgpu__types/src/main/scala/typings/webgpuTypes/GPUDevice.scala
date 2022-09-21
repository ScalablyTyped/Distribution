package typings.webgpuTypes

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUDevice
  extends StObject
     with EventTarget
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUDevice = js.native
  
  /**
    * Creates a {@link GPUBindGroup}.
    * @param descriptor - Description of the {@link GPUBindGroup} to create.
    */
  def createBindGroup(descriptor: GPUBindGroupDescriptor): GPUBindGroup = js.native
  
  /**
    * Creates a {@link GPUBindGroupLayout}.
    * @param descriptor - Description of the {@link GPUBindGroupLayout} to create.
    */
  def createBindGroupLayout(descriptor: GPUBindGroupLayoutDescriptor): GPUBindGroupLayout = js.native
  
  /**
    * Creates a {@link GPUBuffer}.
    * @param descriptor - Description of the {@link GPUBuffer} to create.
    */
  def createBuffer(descriptor: GPUBufferDescriptor): GPUBuffer = js.native
  
  /**
    * Creates a {@link GPUCommandEncoder}.
    * @param descriptor - Description of the {@link GPUCommandEncoder} to create.
    */
  def createCommandEncoder(): GPUCommandEncoder = js.native
  def createCommandEncoder(descriptor: GPUCommandEncoderDescriptor): GPUCommandEncoder = js.native
  
  /**
    * Creates a {@link GPUComputePipeline}.
    * @param descriptor - Description of the {@link GPUComputePipeline} to create.
    */
  def createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline = js.native
  
  /**
    * Creates a {@link GPUComputePipeline}. The returned {@link Promise} resolves when the created pipeline
    * is ready to be used without additional delay.
    * If pipeline creation fails, the returned {@link Promise} rejects with an {@link OperationError}.
    * Note: Use of this method is preferred whenever possible, as it prevents blocking the
    * queue timeline work on pipeline compilation.
    * @param descriptor - Description of the {@link GPUComputePipeline} to create.
    */
  def createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): js.Promise[GPUComputePipeline] = js.native
  
  /**
    * Creates a {@link GPUPipelineLayout}.
    * @param descriptor - Description of the {@link GPUPipelineLayout} to create.
    */
  def createPipelineLayout(descriptor: GPUPipelineLayoutDescriptor): GPUPipelineLayout = js.native
  
  /**
    * Creates a {@link GPUQuerySet}.
    * @param descriptor - Description of the {@link GPUQuerySet} to create.
    */
  def createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet = js.native
  
  /**
    * Creates a {@link GPURenderBundleEncoder}.
    * @param descriptor - Description of the {@link GPURenderBundleEncoder} to create.
    */
  def createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder = js.native
  
  /**
    * Creates a {@link GPURenderPipeline}.
    * @param descriptor - Description of the {@link GPURenderPipeline} to create.
    */
  def createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline = js.native
  
  /**
    * Creates a {@link GPURenderPipeline}. The returned {@link Promise} resolves when the created pipeline
    * is ready to be used without additional delay.
    * If pipeline creation fails, the returned {@link Promise} rejects with an {@link OperationError}.
    * Note: Use of this method is preferred whenever possible, as it prevents blocking the
    * queue timeline work on pipeline compilation.
    * @param descriptor - Description of the {@link GPURenderPipeline} to create.
    */
  def createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): js.Promise[GPURenderPipeline] = js.native
  
  /**
    * Creates a {@link GPUSampler}.
    * @param descriptor - Description of the {@link GPUSampler} to create.
    */
  def createSampler(): GPUSampler = js.native
  def createSampler(descriptor: GPUSamplerDescriptor): GPUSampler = js.native
  
  /**
    * Creates a {@link GPUShaderModule}.
    * @param descriptor - Description of the {@link GPUShaderModule} to create.
    */
  def createShaderModule(descriptor: GPUShaderModuleDescriptor): GPUShaderModule = js.native
  
  /**
    * Creates a {@link GPUTexture}.
    * @param descriptor - Description of the {@link GPUTexture} to create.
    */
  def createTexture(descriptor: GPUTextureDescriptor): GPUTexture = js.native
  
  /**
    * Destroys the device, preventing further operations on it.
    * Outstanding asynchronous operations will fail.
    * Note: It is valid to destroy a device multiple times.
    * Note: Since no further operations can be enqueued on this device, implementations can abort
    * outstanding asynchronous operations immediately and free resource allocations, including
    * mapped memory that was just unmapped.
    */
  def destroy(): Unit = js.native
  
  /**
    * A set containing the {@link GPUFeatureName} values of the features
    * supported by the device (i.e. the ones with which it was created).
    */
  val features: GPUSupportedFeatures = js.native
  
  /**
    * Creates a {@link GPUExternalTexture} wrapping the provided image source.
    * @param descriptor - Provides the external image source object (and any creation options).
    */
  def importExternalTexture(descriptor: GPUExternalTextureDescriptor): GPUExternalTexture = js.native
  
  /**
    * Exposes the limits supported by the device
    * (which are exactly the ones with which it was created).
    */
  val limits: GPUSupportedLimits = js.native
  
  /**
    * A promise which is created with the device, remains pending for the lifetime of the device,
    * then resolves when the device is lost.
    * This attribute is backed by an immutable internal slot of the same name, initially set
    * to a new promise, and always returns its value.
    */
  val lost: js.Promise[GPUDeviceLostInfo] = js.native
  
  /**
    * An event handler IDL attribute for the {@link GPUDevice#uncapturederror} event type.
    */
  var onuncapturederror: (js.ThisFunction1[/* this */ this.type, /* ev */ GPUUncapturedErrorEvent, Any]) | Null = js.native
  
  /**
    * Pops a GPU error scope off the {@link GPUDevice#[[errorScopeStack]]} for `this`
    * and resolves to a {@link GPUError} if one was observed by the error scope.
    */
  def popErrorScope(): js.Promise[GPUError | Null] = js.native
  
  /**
    * Pushes a new GPU error scope onto the {@link GPUDevice#[[errorScopeStack]]} for `this`.
    * @param filter - Which class of errors this error scope observes.
    */
  def pushErrorScope(filter: GPUErrorFilter): Unit = js.native
  
  /**
    * The primary {@link GPUQueue} for this device.
    */
  val queue: GPUQueue = js.native
}
