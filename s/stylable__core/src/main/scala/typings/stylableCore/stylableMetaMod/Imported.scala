package typings.stylableCore.stylableMetaMod

import typings.postcss.mod.Rule_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imported extends js.Object {
  
  var context: String = js.native
  
  var defaultExport: String = js.native
  
  var from: String = js.native
  
  var fromRelative: String = js.native
  
  var keyframes: Record[String, String] = js.native
  
  var named: Record[String, String] = js.native
  
  var rule: Rule_ = js.native
}
object Imported {
  
  @scala.inline
  def apply(
    context: String,
    defaultExport: String,
    from: String,
    fromRelative: String,
    keyframes: Record[String, String],
    named: Record[String, String],
    rule: Rule_
  ): Imported = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], defaultExport = defaultExport.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fromRelative = fromRelative.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imported]
  }
  
  @scala.inline
  implicit class ImportedOps[Self <: Imported] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExport(value: String): Self = this.set("defaultExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromRelative(value: String): Self = this.set("fromRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframes(value: Record[String, String]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: Record[String, String]): Self = this.set("named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Rule_): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
}
