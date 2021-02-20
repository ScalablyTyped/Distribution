package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseQueryCommand extends DatabaseLogicCommand {
  
  def all(`val`: js.Array[_]): DatabaseLogicCommand = js.native
  
  def elemMatch(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def eq(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def exists(`val`: Boolean): DatabaseLogicCommand = js.native
  
  def geoIntersects(options: IGeoIntersectsCommandOptions): DatabaseLogicCommand = js.native
  
  def geoNear(options: IGeoNearCommandOptions): DatabaseLogicCommand = js.native
  
  def geoWithin(options: IGeoWithinCommandOptions): DatabaseLogicCommand = js.native
  
  def gt(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def gte(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def in(`val`: js.Array[_]): DatabaseLogicCommand = js.native
  
  def lt(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def lte(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def mod(divisor: Double, remainder: Double): DatabaseLogicCommand = js.native
  
  def neq(`val`: js.Any): DatabaseLogicCommand = js.native
  
  def nin(`val`: js.Array[_]): DatabaseLogicCommand = js.native
  
  def size(`val`: Double): DatabaseLogicCommand = js.native
}
object DatabaseQueryCommand {
  
  @scala.inline
  def apply(
    all: js.Array[_] => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    elemMatch: js.Any => DatabaseLogicCommand,
    eq_ : js.Any => DatabaseLogicCommand,
    exists: Boolean => DatabaseLogicCommand,
    geoIntersects: IGeoIntersectsCommandOptions => DatabaseLogicCommand,
    geoNear: IGeoNearCommandOptions => DatabaseLogicCommand,
    geoWithin: IGeoWithinCommandOptions => DatabaseLogicCommand,
    gt: js.Any => DatabaseLogicCommand,
    gte: js.Any => DatabaseLogicCommand,
    in: js.Array[_] => DatabaseLogicCommand,
    lt: js.Any => DatabaseLogicCommand,
    lte: js.Any => DatabaseLogicCommand,
    mod: (Double, Double) => DatabaseLogicCommand,
    neq: js.Any => DatabaseLogicCommand,
    nin: js.Array[_] => DatabaseLogicCommand,
    nor: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    size: Double => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), and = js.Any.fromFunction1(and), elemMatch = js.Any.fromFunction1(elemMatch), exists = js.Any.fromFunction1(exists), geoIntersects = js.Any.fromFunction1(geoIntersects), geoNear = js.Any.fromFunction1(geoNear), geoWithin = js.Any.fromFunction1(geoWithin), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mod = js.Any.fromFunction2(mod), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or), size = js.Any.fromFunction1(size))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  
  @scala.inline
  implicit class DatabaseQueryCommandMutableBuilder[Self <: DatabaseQueryCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Array[_] => DatabaseLogicCommand): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElemMatch(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "elemMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEq_(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExists(value: Boolean => DatabaseLogicCommand): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoIntersects(value: IGeoIntersectsCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoIntersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoNear(value: IGeoNearCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoNear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoWithin(value: IGeoWithinCommandOptions => DatabaseLogicCommand): Self = StObject.set(x, "geoWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGt(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGte(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: js.Array[_] => DatabaseLogicCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLt(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLte(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMod(value: (Double, Double) => DatabaseLogicCommand): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNeq(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNin(value: js.Array[_] => DatabaseLogicCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double => DatabaseLogicCommand): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
