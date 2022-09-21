package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseQueryCommand
  extends StObject
     with DatabaseLogicCommand {
  
  def all(`val`: js.Array[Any]): DatabaseLogicCommand
  
  def elemMatch(`val`: Any): DatabaseLogicCommand
  
  def exists(`val`: Boolean): DatabaseLogicCommand
  
  def geoIntersects(options: IGeoIntersectsCommandOptions): DatabaseLogicCommand
  
  def geoNear(options: IGeoNearCommandOptions): DatabaseLogicCommand
  
  def geoWithin(options: IGeoWithinCommandOptions): DatabaseLogicCommand
  
  def gt(`val`: Any): DatabaseLogicCommand
  
  def gte(`val`: Any): DatabaseLogicCommand
  
  def in(`val`: js.Array[Any]): DatabaseLogicCommand
  
  def lt(`val`: Any): DatabaseLogicCommand
  
  def lte(`val`: Any): DatabaseLogicCommand
  
  def mod(divisor: Double, remainder: Double): DatabaseLogicCommand
  
  def neq(`val`: Any): DatabaseLogicCommand
  
  def nin(`val`: js.Array[Any]): DatabaseLogicCommand
  
  def size(`val`: Double): DatabaseLogicCommand
}
object DatabaseQueryCommand {
  
  inline def apply(
    all: js.Array[Any] => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    elemMatch: Any => DatabaseLogicCommand,
    exists: Boolean => DatabaseLogicCommand,
    geoIntersects: IGeoIntersectsCommandOptions => DatabaseLogicCommand,
    geoNear: IGeoNearCommandOptions => DatabaseLogicCommand,
    geoWithin: IGeoWithinCommandOptions => DatabaseLogicCommand,
    gt: Any => DatabaseLogicCommand,
    gte: Any => DatabaseLogicCommand,
    in: js.Array[Any] => DatabaseLogicCommand,
    lt: Any => DatabaseLogicCommand,
    lte: Any => DatabaseLogicCommand,
    mod: (Double, Double) => DatabaseLogicCommand,
    neq: Any => DatabaseLogicCommand,
    nin: js.Array[Any] => DatabaseLogicCommand,
    nor: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    size: Double => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), and = js.Any.fromFunction1(and), elemMatch = js.Any.fromFunction1(elemMatch), exists = js.Any.fromFunction1(exists), geoIntersects = js.Any.fromFunction1(geoIntersects), geoNear = js.Any.fromFunction1(geoNear), geoWithin = js.Any.fromFunction1(geoWithin), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mod = js.Any.fromFunction2(mod), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or), size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  
  extension [Self <: DatabaseQueryCommand](x: Self) {
    
    inline def setAll(value: js.Array[Any] => DatabaseLogicCommand): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
    
    inline def setElemMatch(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "elemMatch", js.Any.fromFunction1(value))
    
    inline def setExists(value: Boolean => DatabaseLogicCommand): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    inline def setGeoIntersects(value: IGeoIntersectsCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoIntersects", js.Any.fromFunction1(value))
    
    inline def setGeoNear(value: IGeoNearCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoNear", js.Any.fromFunction1(value))
    
    inline def setGeoWithin(value: IGeoWithinCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoWithin", js.Any.fromFunction1(value))
    
    inline def setGt(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setIn(value: js.Array[Any] => DatabaseLogicCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setLt(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setMod(value: (Double, Double) => DatabaseLogicCommand): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
    
    inline def setNeq(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    inline def setNin(value: js.Array[Any] => DatabaseLogicCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    inline def setSize(value: Double => DatabaseLogicCommand): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
