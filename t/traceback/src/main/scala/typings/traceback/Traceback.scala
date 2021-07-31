package typings.traceback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Traceback extends StObject {
  
  // | The line number in the file
  var col: Double
  
  // | The absolute path of the file defining the function
  var file: String
  
  // | The byte position in the file
  var fun: js.Any
  
  // | Boolean indicating whether the function is native
  var is_ctor: Boolean
  
  // | Boolean indicating whether the function was called with a global this
  var is_eval: Boolean
  
  // | Boolean indicating whether the function comes from an eval() call
  var is_native: Boolean
  
  // | The CallSite that ran eval(), if this frame is an eval
  var is_top: Boolean
  
  // | The basename of the path file ("example.js")
  var line: Double
  
  // | The function itself
  var method: String
  
  var name: String
  
  // | The type of this; the name of the constructor function (Object, ReadStream, etc.)
  var origin: js.Any
  
  // | The function name
  var path: String
  
  // | The column number in the file
  var pos: Double
  
  // | If this function was called as a method, the name it is stored as
  var `this`: js.Any
  
  // | The object bound to the label this in the function
  var `type`: String
}
object Traceback {
  
  @scala.inline
  def apply(
    col: Double,
    file: String,
    fun: js.Any,
    is_ctor: Boolean,
    is_eval: Boolean,
    is_native: Boolean,
    is_top: Boolean,
    line: Double,
    method: String,
    name: String,
    origin: js.Any,
    path: String,
    pos: Double,
    `this`: js.Any,
    `type`: String
  ): Traceback = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fun = fun.asInstanceOf[js.Any], is_ctor = is_ctor.asInstanceOf[js.Any], is_eval = is_eval.asInstanceOf[js.Any], is_native = is_native.asInstanceOf[js.Any], is_top = is_top.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Traceback]
  }
  
  @scala.inline
  implicit class TracebackMutableBuilder[Self <: Traceback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFun(value: js.Any): Self = StObject.set(x, "fun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_ctor(value: Boolean): Self = StObject.set(x, "is_ctor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_eval(value: Boolean): Self = StObject.set(x, "is_eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_native(value: Boolean): Self = StObject.set(x, "is_native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_top(value: Boolean): Self = StObject.set(x, "is_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: js.Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: js.Any): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
