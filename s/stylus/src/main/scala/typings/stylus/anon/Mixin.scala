package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mixin extends StObject {
  
  var __type: String
  
  var column: Double
  
  var filename: String
  
  var lineno: Double
  
  var mixin: Boolean
  
  var name: String
  
  var `val`: Node
}
object Mixin {
  
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    mixin: Boolean,
    name: String,
    `val`: Node
  ): Mixin = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], mixin = mixin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin]
  }
  
  @scala.inline
  implicit class MixinMutableBuilder[Self <: Mixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixin(value: Boolean): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: Node): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
