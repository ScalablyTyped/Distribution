package typings.yazl

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
  @js.native
  trait PartialDirectoryOptions extends StObject {
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Date] = js.native
  }
  object PartialDirectoryOptions {
    
    @scala.inline
    def apply(): PartialDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDirectoryOptions]
    }
    
    @scala.inline
    implicit class PartialDirectoryOptionsMutableBuilder[Self <: PartialDirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yazl.yazl.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var forceZip64Format: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Date] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yazl.yazl.ReadStreamOptions> */
  @js.native
  trait PartialReadStreamOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var forceZip64Format: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Date] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object PartialReadStreamOptions {
    
    @scala.inline
    def apply(): PartialReadStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReadStreamOptions]
    }
    
    @scala.inline
    implicit class PartialReadStreamOptionsMutableBuilder[Self <: PartialReadStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceZip64FormatUndefined: Self = StObject.set(x, "forceZip64Format", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
