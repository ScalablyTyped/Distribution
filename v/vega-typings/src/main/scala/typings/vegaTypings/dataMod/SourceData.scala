package typings.vegaTypings.dataMod

import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.transformMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  source :string | std.Array<string>} & vega-typings.vega-typings/types/spec/data.BaseData */
@js.native
trait SourceData extends Data {
  
  var name: String = js.native
  
  var on: js.UndefOr[js.Array[OnTrigger]] = js.native
  
  var source: String | js.Array[String] = js.native
  
  var transform: js.UndefOr[js.Array[Transforms]] = js.native
}
object SourceData {
  
  @scala.inline
  def apply(name: String, source: String | js.Array[String]): SourceData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
  
  @scala.inline
  implicit class SourceDataOps[Self <: SourceData] (val x: Self) extends AnyVal {
    
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
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String | js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVarargs(value: OnTrigger*): Self = this.set("on", js.Array(value :_*))
    
    @scala.inline
    def setOn(value: js.Array[OnTrigger]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Transforms*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Transforms]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
