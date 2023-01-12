package typings.sucrase

import typings.sucrase.distTypesUtilGetImportExportSpecifierInfoMod.ImportExportSpecifierInfo
import typings.sucrase.sucraseBooleans.`false`
import typings.sucrase.sucraseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EndIndex
    extends StObject
       with ImportExportSpecifierInfo {
    
    var endIndex: Double
    
    var isType: `false`
    
    var leftName: String
    
    var rightName: String
  }
  object EndIndex {
    
    inline def apply(endIndex: Double, leftName: String, rightName: String): EndIndex = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = false, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndIndex] (val x: Self) extends AnyVal {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setIsType(value: `false`): Self = StObject.set(x, "isType", value.asInstanceOf[js.Any])
      
      inline def setLeftName(value: String): Self = StObject.set(x, "leftName", value.asInstanceOf[js.Any])
      
      inline def setRightName(value: String): Self = StObject.set(x, "rightName", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsType
    extends StObject
       with ImportExportSpecifierInfo {
    
    var endIndex: Double
    
    var isType: `true`
    
    var leftName: Null
    
    var rightName: Null
  }
  object IsType {
    
    inline def apply(endIndex: Double, leftName: Null, rightName: Null): IsType = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = true, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsType] (val x: Self) extends AnyVal {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setIsType(value: `true`): Self = StObject.set(x, "isType", value.asInstanceOf[js.Any])
      
      inline def setLeftName(value: Null): Self = StObject.set(x, "leftName", value.asInstanceOf[js.Any])
      
      inline def setRightName(value: Null): Self = StObject.set(x, "rightName", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameStringCode extends StObject {
    
    var nameStringCode: String
    
    var variableName: String | Null
  }
  object NameStringCode {
    
    inline def apply(nameStringCode: String): NameStringCode = {
      val __obj = js.Dynamic.literal(nameStringCode = nameStringCode.asInstanceOf[js.Any], variableName = null)
      __obj.asInstanceOf[NameStringCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameStringCode] (val x: Self) extends AnyVal {
      
      inline def setNameStringCode(value: String): Self = StObject.set(x, "nameStringCode", value.asInstanceOf[js.Any])
      
      inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
      
      inline def setVariableNameNull: Self = StObject.set(x, "variableName", null)
    }
  }
}
