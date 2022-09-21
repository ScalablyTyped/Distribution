package typings.vexflow.Vex.Flow

import typings.vexflow.anon.IncrementPos
import typings.vexflow.anon.MatchedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  var errorPos: Any = js.native
  
  def expect(rules: Any): Any = js.native
  
  def expectOne(rule: Any): Any = js.native
  def expectOne(rule: Any, maybe: Boolean): Any = js.native
  
  def expectOneOrMore(rule: Any): Any = js.native
  def expectOneOrMore(rule: Any, maybe: Boolean): Any = js.native
  
  def expectZeroOrMore(rule: Any): Any = js.native
  
  var grammar: Any = js.native
  
  var line: Any = js.native
  
  def matchFail(returnPos: Any): Unit = js.native
  
  def matchSuccess(): Unit = js.native
  
  def matchToken(token: Any): IncrementPos | MatchedString = js.native
  def matchToken(token: Any, noSpace: Boolean): IncrementPos | MatchedString = js.native
  
  def parse(line: Any): Any = js.native
  
  var pos: Any = js.native
}
