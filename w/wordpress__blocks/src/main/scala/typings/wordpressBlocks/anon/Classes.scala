package typings.wordpressBlocks.anon

import typings.std.RegExp
import typings.wordpressBlocks.mod.TransformRawSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes extends StObject {
  
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  var children: js.UndefOr[TransformRawSchema] = js.native
  
  var classes: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var require: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.native
}
object Classes {
  
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: TransformRawSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Array[String | RegExp]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setRequire(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
        ]
    ): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setRequireVarargs(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any)*
    ): Self = StObject.set(x, "require", js.Array(value :_*))
  }
}
