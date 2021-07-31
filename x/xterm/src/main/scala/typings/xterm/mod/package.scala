package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.xterm.xtermStrings.normal
  - typings.xterm.xtermStrings.bold
  - typings.xterm.xtermStrings.`100`
  - typings.xterm.xtermStrings.`200`
  - typings.xterm.xtermStrings.`300`
  - typings.xterm.xtermStrings.`400`
  - typings.xterm.xtermStrings.`500`
  - typings.xterm.xtermStrings.`600`
  - typings.xterm.xtermStrings.`700`
  - typings.xterm.xtermStrings.`800`
  - typings.xterm.xtermStrings.`900`
  - scala.Double
*/
type FontWeight = typings.xterm.mod._FontWeight | scala.Double

type IEvent[T, U] = js.Function1[
/* listener */ js.Function2[/* arg1 */ T, /* arg2 */ U, js.Any], 
typings.xterm.mod.IDisposable]
