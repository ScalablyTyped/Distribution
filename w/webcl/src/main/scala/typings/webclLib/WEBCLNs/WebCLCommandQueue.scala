package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.5
@js.native
trait WebCLCommandQueue extends js.Object {
  def enqueueBarrier(): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Copying: Buffer <-> Buffer, Image <-> Image, Buffer <-> Image
  //
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: scala.Double,
    dstOffset: scala.Double,
    numBytes: scala.Double
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Copying: Buffer <-> Buffer, Image <-> Image, Buffer <-> Image
  //
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: scala.Double,
    dstOffset: scala.Double,
    numBytes: scala.Double,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Copying: Buffer <-> Buffer, Image <-> Image, Buffer <-> Image
  //
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: scala.Double,
    dstOffset: scala.Double,
    numBytes: scala.Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    srcRowPitch: scala.Double,
    srcSlicePitch: scala.Double,
    dstRowPitch: scala.Double,
    dstSlicePitch: scala.Double
  ): scala.Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    srcRowPitch: scala.Double,
    srcSlicePitch: scala.Double,
    dstRowPitch: scala.Double,
    dstSlicePitch: scala.Double,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    srcRowPitch: scala.Double,
    srcSlicePitch: scala.Double,
    dstRowPitch: scala.Double,
    dstSlicePitch: scala.Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: scala.Double,
    dstOrigin: js.Array[scala.Double],
    dstRegion: js.Array[scala.Double]
  ): scala.Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: scala.Double,
    dstOrigin: js.Array[scala.Double],
    dstRegion: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: scala.Double,
    dstOrigin: js.Array[scala.Double],
    dstRegion: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double]
  ): scala.Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[scala.Double],
    dstOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    srcRegion: js.Array[scala.Double],
    dstOffset: scala.Double
  ): scala.Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    srcRegion: js.Array[scala.Double],
    dstOffset: scala.Double,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[scala.Double],
    srcRegion: js.Array[scala.Double],
    dstOffset: scala.Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Synchronization
  //
  def enqueueMarker(event: WebCLEvent): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Executing kernels
  //
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: scala.Double,
    globalWorkOffset: js.Array[scala.Double],
    globalWorkSize: js.Array[scala.Double]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Executing kernels
  //
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: scala.Double,
    globalWorkOffset: js.Array[scala.Double],
    globalWorkSize: js.Array[scala.Double],
    localWorkSize: js.Array[scala.Double]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Executing kernels
  //
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: scala.Double,
    globalWorkOffset: js.Array[scala.Double],
    globalWorkSize: js.Array[scala.Double],
    localWorkSize: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Executing kernels
  //
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: scala.Double,
    globalWorkOffset: js.Array[scala.Double],
    globalWorkSize: js.Array[scala.Double],
    localWorkSize: js.Array[scala.Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Reading: Buffer -> Host, Image -> Host
  //
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Reading: Buffer -> Host, Image -> Host
  //
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Reading: Buffer -> Host, Image -> Host
  //
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueWaitForEvents(eventWaitList: js.Array[WebCLEvent]): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Writing: Host -> Buffer, Host -> Image
  //
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Writing: Host -> Buffer, Host -> Image
  //
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Writing: Host -> Buffer, Host -> Image
  //
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOffset: scala.Double,
    numBytes: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: scala.Boolean,
    bufferOrigin: js.Array[scala.Double],
    hostOrigin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    bufferRowPitch: scala.Double,
    bufferSlicePitch: scala.Double,
    hostRowPitch: scala.Double,
    hostSlicePitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): scala.Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: scala.Boolean,
    origin: js.Array[scala.Double],
    region: js.Array[scala.Double],
    hostRowPitch: scala.Double,
    hostPtr: stdLib.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def finish(whenFinished: WebCLCallback): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  ////////////////////////////////////////////////////////////////////////////
  //
  // Querying command queue information
  //
  def getInfo(name: ContextProperties): js.Any = js.native
  def release(): scala.Unit = js.native
}

