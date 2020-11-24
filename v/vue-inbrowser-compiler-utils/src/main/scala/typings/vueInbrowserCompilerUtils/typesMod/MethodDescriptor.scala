package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDescriptor
  extends Descriptor
     with /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.native
  
  var modifiers: js.UndefOr[js.Array[String]] = js.native
  
  var name: String = js.native
  
  var params: js.UndefOr[js.Array[Param]] = js.native
  
  var returns: js.UndefOr[UnnamedParam] = js.native
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.native
  
  var throws: js.UndefOr[UnnamedParam] = js.native
}
object MethodDescriptor {
  
  @scala.inline
  def apply(name: String): MethodDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDescriptor]
  }
  
  @scala.inline
  implicit class MethodDescriptorOps[Self <: MethodDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: String*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[String]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: Param*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Param]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReturns(value: UnnamedParam): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThrows(value: UnnamedParam): Self = this.set("throws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrows: Self = this.set("throws", js.undefined)
  }
}
