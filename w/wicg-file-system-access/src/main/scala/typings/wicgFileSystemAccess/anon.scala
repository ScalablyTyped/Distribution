package typings.wicgFileSystemAccess

import typings.std.Blob
import typings.std.BufferSource
import typings.wicgFileSystemAccess.mod.global.ChooseFileSystemEntriesOptionsAccepts
import typings.wicgFileSystemAccess.mod.global.FilePickerAcceptType
import typings.wicgFileSystemAccess.mod.global.WriteParams
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`true`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.`open-directory`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.`open-file`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.`save-file`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.seek
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.truncate
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :false | undefined} */
  trait ChooseFileSystemEntriesFi extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.undefined
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
    
    var multiple: js.UndefOr[`false`] = js.undefined
    
    var `type`: js.UndefOr[`open-file`] = js.undefined
  }
  object ChooseFileSystemEntriesFi {
    
    inline def apply(): ChooseFileSystemEntriesFi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChooseFileSystemEntriesFi]
    }
    
    extension [Self <: ChooseFileSystemEntriesFi](x: Self) {
      
      inline def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value*))
      
      inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setType(value: `open-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :true} */
  trait ChooseFileSystemEntriesFiAccepts extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.undefined
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
    
    var multiple: `true`
    
    var `type`: js.UndefOr[`open-file`] = js.undefined
  }
  object ChooseFileSystemEntriesFiAccepts {
    
    inline def apply(): ChooseFileSystemEntriesFiAccepts = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[ChooseFileSystemEntriesFiAccepts]
    }
    
    extension [Self <: ChooseFileSystemEntriesFiAccepts](x: Self) {
      
      inline def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value*))
      
      inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setType(value: `open-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'save-file'} */
  trait ChooseFileSystemEntriesFiExcludeAcceptAllOption extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.undefined
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
    
    var `type`: `save-file`
  }
  object ChooseFileSystemEntriesFiExcludeAcceptAllOption {
    
    inline def apply(): ChooseFileSystemEntriesFiExcludeAcceptAllOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("save-file")
      __obj.asInstanceOf[ChooseFileSystemEntriesFiExcludeAcceptAllOption]
    }
    
    extension [Self <: ChooseFileSystemEntriesFiExcludeAcceptAllOption](x: Self) {
      
      inline def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value*))
      
      inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      inline def setType(value: `save-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data
    extends StObject
       with WriteParams {
    
    var data: BufferSource | Blob | String
    
    var position: js.UndefOr[Double] = js.undefined
    
    var `type`: write
  }
  object Data {
    
    inline def apply(data: BufferSource | Blob | String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("write")
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: BufferSource | Blob | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: write): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.OpenFilePickerOptions & {  multiple :false | undefined} */
  trait OpenFilePickerOptionsmult extends StObject {
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.undefined
  }
  object OpenFilePickerOptionsmult {
    
    inline def apply(): OpenFilePickerOptionsmult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenFilePickerOptionsmult]
    }
    
    extension [Self <: OpenFilePickerOptionsmult](x: Self) {
      
      inline def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      inline def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setTypes(value: js.Array[FilePickerAcceptType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: FilePickerAcceptType*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait Position
    extends StObject
       with WriteParams {
    
    var position: Double
    
    var `type`: seek
  }
  object Position {
    
    inline def apply(position: Double): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("seek")
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setType(value: seek): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size
    extends StObject
       with WriteParams {
    
    var size: Double
    
    var `type`: truncate
  }
  object Size {
    
    inline def apply(size: Double): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("truncate")
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: truncate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: `open-directory`
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("open-directory")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: `open-directory`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
