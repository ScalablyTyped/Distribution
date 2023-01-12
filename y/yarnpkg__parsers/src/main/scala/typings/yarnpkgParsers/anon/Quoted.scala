package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import typings.yarnpkgParsers.libGrammarsShellMod.ShellLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quoted
  extends StObject
     with ArgumentSegment {
  
  var quoted: Boolean
  
  var shell: ShellLine
  
  var `type`: /* template literal string: shell */ String
}
object Quoted {
  
  inline def apply(quoted: Boolean, shell: ShellLine, `type`: /* template literal string: shell */ String): Quoted = {
    val __obj = js.Dynamic.literal(quoted = quoted.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quoted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quoted] (val x: Self) extends AnyVal {
    
    inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    inline def setShell(value: ShellLine): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellVarargs(value: Command*): Self = StObject.set(x, "shell", js.Array(value*))
    
    inline def setType(value: /* template literal string: shell */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
