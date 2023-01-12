package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with ArgumentSegment {
  
  var text: String
  
  var `type`: /* template literal string: text */ String
}
object Text {
  
  inline def apply(text: String, `type`: /* template literal string: text */ String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* template literal string: text */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
