package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.anon.Abs
import typings.wechatMiniprogram.anon.Slice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseCommand extends StObject {
  
  def addToSet(`val`: Any): DatabaseUpdateCommand
  
  var aggregate: Abs
  
  def all(`val`: js.Array[Any]): DatabaseQueryCommand
  
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  
  def bit(`val`: Double): DatabaseUpdateCommand
  
  def elemMatch(`val`: Any): DatabaseQueryCommand
  
  def exists(`val`: Boolean): DatabaseQueryCommand
  
  def geoIntersects(options: IGeoIntersectsCommandOptions): DatabaseQueryCommand
  
  def geoNear(options: IGeoNearCommandOptions): DatabaseQueryCommand
  
  def geoWithin(options: IGeoWithinCommandOptions): DatabaseQueryCommand
  
  def gt(`val`: Any): DatabaseQueryCommand
  
  def gte(`val`: Any): DatabaseQueryCommand
  
  def in(`val`: js.Array[Any]): DatabaseQueryCommand
  
  def inc(`val`: Double): DatabaseUpdateCommand
  
  def lt(`val`: Any): DatabaseQueryCommand
  
  def lte(`val`: Any): DatabaseQueryCommand
  
  def max(`val`: Double): DatabaseUpdateCommand
  
  def min(`val`: Double): DatabaseUpdateCommand
  
  def mod(divisor: Double, remainder: Double): DatabaseQueryCommand
  
  def mul(`val`: Double): DatabaseUpdateCommand
  
  def neq(`val`: Any): DatabaseQueryCommand
  
  def nin(`val`: js.Array[Any]): DatabaseQueryCommand
  
  def nor(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  
  def not(expression: DatabaseLogicCommand): DatabaseLogicCommand
  
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  
  def pop(): DatabaseUpdateCommand
  
  var project: Slice
  
  def pull(`val`: Any): DatabaseUpdateCommand
  
  def pullAll(`val`: Any): DatabaseUpdateCommand
  
  def push(values: Any*): DatabaseUpdateCommand
  
  def remove(): DatabaseUpdateCommand
  
  def rename(`val`: String): DatabaseUpdateCommand
  
  def set(`val`: Any): DatabaseUpdateCommand
  
  def shift(): DatabaseUpdateCommand
  
  def size(`val`: Double): DatabaseQueryCommand
  
  def unshift(values: Any*): DatabaseUpdateCommand
}
object DatabaseCommand {
  
  inline def apply(
    addToSet: Any => DatabaseUpdateCommand,
    aggregate: Abs,
    all: js.Array[Any] => DatabaseQueryCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    bit: Double => DatabaseUpdateCommand,
    elemMatch: Any => DatabaseQueryCommand,
    exists: Boolean => DatabaseQueryCommand,
    geoIntersects: IGeoIntersectsCommandOptions => DatabaseQueryCommand,
    geoNear: IGeoNearCommandOptions => DatabaseQueryCommand,
    geoWithin: IGeoWithinCommandOptions => DatabaseQueryCommand,
    gt: Any => DatabaseQueryCommand,
    gte: Any => DatabaseQueryCommand,
    in: js.Array[Any] => DatabaseQueryCommand,
    inc: Double => DatabaseUpdateCommand,
    lt: Any => DatabaseQueryCommand,
    lte: Any => DatabaseQueryCommand,
    max: Double => DatabaseUpdateCommand,
    min: Double => DatabaseUpdateCommand,
    mod: (Double, Double) => DatabaseQueryCommand,
    mul: Double => DatabaseUpdateCommand,
    neq: Any => DatabaseQueryCommand,
    nin: js.Array[Any] => DatabaseQueryCommand,
    nor: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    pop: () => DatabaseUpdateCommand,
    project: Slice,
    pull: Any => DatabaseUpdateCommand,
    pullAll: Any => DatabaseUpdateCommand,
    push: /* repeated */ Any => DatabaseUpdateCommand,
    remove: () => DatabaseUpdateCommand,
    rename: String => DatabaseUpdateCommand,
    set: Any => DatabaseUpdateCommand,
    shift: () => DatabaseUpdateCommand,
    size: Double => DatabaseQueryCommand,
    unshift: /* repeated */ Any => DatabaseUpdateCommand
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal(addToSet = js.Any.fromFunction1(addToSet), aggregate = aggregate.asInstanceOf[js.Any], all = js.Any.fromFunction1(all), and = js.Any.fromFunction1(and), bit = js.Any.fromFunction1(bit), elemMatch = js.Any.fromFunction1(elemMatch), exists = js.Any.fromFunction1(exists), geoIntersects = js.Any.fromFunction1(geoIntersects), geoNear = js.Any.fromFunction1(geoNear), geoWithin = js.Any.fromFunction1(geoWithin), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), inc = js.Any.fromFunction1(inc), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mod = js.Any.fromFunction2(mod), mul = js.Any.fromFunction1(mul), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or), pop = js.Any.fromFunction0(pop), project = project.asInstanceOf[js.Any], pull = js.Any.fromFunction1(pull), pullAll = js.Any.fromFunction1(pullAll), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction0(remove), rename = js.Any.fromFunction1(rename), set = js.Any.fromFunction1(set), shift = js.Any.fromFunction0(shift), size = js.Any.fromFunction1(size), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[DatabaseCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseCommand] (val x: Self) extends AnyVal {
    
    inline def setAddToSet(value: Any => DatabaseUpdateCommand): Self = StObject.set(x, "addToSet", js.Any.fromFunction1(value))
    
    inline def setAggregate(value: Abs): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAll(value: js.Array[Any] => DatabaseQueryCommand): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
    
    inline def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setBit(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "bit", js.Any.fromFunction1(value))
    
    inline def setElemMatch(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "elemMatch", js.Any.fromFunction1(value))
    
    inline def setExists(value: Boolean => DatabaseQueryCommand): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    inline def setGeoIntersects(value: IGeoIntersectsCommandOptions => DatabaseQueryCommand): Self = StObject.set(x, "geoIntersects", js.Any.fromFunction1(value))
    
    inline def setGeoNear(value: IGeoNearCommandOptions => DatabaseQueryCommand): Self = StObject.set(x, "geoNear", js.Any.fromFunction1(value))
    
    inline def setGeoWithin(value: IGeoWithinCommandOptions => DatabaseQueryCommand): Self = StObject.set(x, "geoWithin", js.Any.fromFunction1(value))
    
    inline def setGt(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setIn(value: js.Array[Any] => DatabaseQueryCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setInc(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "inc", js.Any.fromFunction1(value))
    
    inline def setLt(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setMax(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMod(value: (Double, Double) => DatabaseQueryCommand): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
    
    inline def setMul(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setNeq(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    inline def setNin(value: js.Array[Any] => DatabaseQueryCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    inline def setNor(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "nor", js.Any.fromFunction1(value))
    
    inline def setNot(value: DatabaseLogicCommand => DatabaseLogicCommand): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
    
    inline def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    
    inline def setPop(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setProject(value: Slice): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setPull(value: Any => DatabaseUpdateCommand): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullAll(value: Any => DatabaseUpdateCommand): Self = StObject.set(x, "pullAll", js.Any.fromFunction1(value))
    
    inline def setPush(value: /* repeated */ Any => DatabaseUpdateCommand): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setRemove(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setRename(value: String => DatabaseUpdateCommand): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
    
    inline def setSet(value: Any => DatabaseUpdateCommand): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setShift(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setSize(value: Double => DatabaseQueryCommand): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setUnshift(value: /* repeated */ Any => DatabaseUpdateCommand): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
  }
}
