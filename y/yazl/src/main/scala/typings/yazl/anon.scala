package typings.yazl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
  trait PartialDirectoryOptions extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[js.Date] = js.undefined
  }
  object PartialDirectoryOptions {
    
    inline def apply(): PartialDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDirectoryOptions]
    }
    
    extension [Self <: PartialDirectoryOptions](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yazl.yazl.Options> */
  trait PartialOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var forceZip64Format: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[js.Date] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      inline def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yazl.yazl.ReadStreamOptions> */
  trait PartialReadStreamOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var forceZip64Format: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object PartialReadStreamOptions {
    
    inline def apply(): PartialReadStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReadStreamOptions]
    }
    
    extension [Self <: PartialReadStreamOptions](x: Self) {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      inline def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
