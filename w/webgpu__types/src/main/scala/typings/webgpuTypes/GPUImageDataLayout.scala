package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageDataLayout extends StObject {
  
  /**
    * The stride, in bytes, between the beginning of each block row and the subsequent block row.
    * Required if there are multiple block rows (i.e. the copy height or depth is more than one block).
    */
  var bytesPerRow: js.UndefOr[GPUSize32] = js.undefined
  
  /**
    * The offset, in bytes, from the beginning of the image data source (such as a
    * {@link GPUImageCopyBuffer#buffer|GPUImageCopyBuffer.buffer}) to the start of the image data
    * within that source.
    */
  var offset: js.UndefOr[GPUSize64] = js.undefined
  
  /**
    * Number of block rows per single image of the texture.
    * {@link GPUImageDataLayout#rowsPerImage} &times;
    * {@link GPUImageDataLayout#bytesPerRow} is the stride, in bytes, between the beginning of each image of data and the subsequent image.
    * Required if there are multiple images (i.e. the copy depth is more than one).
    */
  var rowsPerImage: js.UndefOr[GPUSize32] = js.undefined
}
object GPUImageDataLayout {
  
  inline def apply(): GPUImageDataLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUImageDataLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageDataLayout] (val x: Self) extends AnyVal {
    
    inline def setBytesPerRow(value: GPUSize32): Self = StObject.set(x, "bytesPerRow", value.asInstanceOf[js.Any])
    
    inline def setBytesPerRowUndefined: Self = StObject.set(x, "bytesPerRow", js.undefined)
    
    inline def setOffset(value: GPUSize64): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRowsPerImage(value: GPUSize32): Self = StObject.set(x, "rowsPerImage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerImageUndefined: Self = StObject.set(x, "rowsPerImage", js.undefined)
  }
}
