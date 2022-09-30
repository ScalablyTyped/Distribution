package typings.wordpressBlocks.anon

import typings.wordpressBlocks.mod.TransformRawSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var children: js.UndefOr[TransformRawSchema] = js.undefined
  
  var classes: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var require: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ Any
    ]
  ] = js.undefined
}
object Classes {
  
  inline def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  extension [Self <: Classes](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setChildren(value: TransformRawSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setRequire(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ Any
        ]
    ): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setRequireVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ Any)*): Self = StObject.set(x, "require", js.Array(value*))
  }
}
