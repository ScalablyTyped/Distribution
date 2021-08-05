package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseLogicCommand extends StObject {
  
  def and(expressions: DatabaseLogicCommand*): DatabaseLogicCommand
  
  def nor(expressions: DatabaseLogicCommand*): DatabaseLogicCommand
  
  def not(expression: DatabaseLogicCommand): DatabaseLogicCommand
  
  def or(expressions: DatabaseLogicCommand*): DatabaseLogicCommand
}
object DatabaseLogicCommand {
  
  inline def apply(
    and: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    nor: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand
  ): DatabaseLogicCommand = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseLogicCommand]
  }
  
  extension [Self <: DatabaseLogicCommand](x: Self) {
    
    inline def setAnd(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setNor(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = StObject.set(x, "nor", js.Any.fromFunction1(value))
    
    inline def setNot(value: DatabaseLogicCommand => DatabaseLogicCommand): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
    
    inline def setOr(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
  }
}
