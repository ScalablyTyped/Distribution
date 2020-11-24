package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.anon.Abs
import typings.wechatMiniprogram.anon.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseCommand extends js.Object {
  
  def addToSet(`val`: js.Any): DatabaseUpdateCommand = js.native
  
  var aggregate: Abs = js.native
  
  def all(`val`: js.Array[_]): DatabaseQueryCommand = js.native
  
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  def bit(`val`: Double): DatabaseUpdateCommand = js.native
  
  def elemMatch(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def eq(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def exists(`val`: Boolean): DatabaseQueryCommand = js.native
  
  def geoIntersects(options: IGeoIntersectsCommandOptions): DatabaseQueryCommand = js.native
  
  def geoNear(options: IGeoNearCommandOptions): DatabaseQueryCommand = js.native
  
  def geoWithin(options: IGeoWithinCommandOptions): DatabaseQueryCommand = js.native
  
  def gt(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def gte(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def in(`val`: js.Array[_]): DatabaseQueryCommand = js.native
  
  def inc(`val`: Double): DatabaseUpdateCommand = js.native
  
  def lt(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def lte(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def max(`val`: Double): DatabaseUpdateCommand = js.native
  
  def min(`val`: Double): DatabaseUpdateCommand = js.native
  
  def mod(divisor: Double, remainder: Double): DatabaseQueryCommand = js.native
  
  def mul(`val`: Double): DatabaseUpdateCommand = js.native
  
  def neq(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def nin(`val`: js.Array[_]): DatabaseQueryCommand = js.native
  
  def nor(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  def not(expression: DatabaseLogicCommand): DatabaseLogicCommand = js.native
  
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  def pop(): DatabaseUpdateCommand = js.native
  
  var project: Slice = js.native
  
  def pull(`val`: js.Any): DatabaseUpdateCommand = js.native
  
  def pullAll(`val`: js.Any): DatabaseUpdateCommand = js.native
  
  def push(values: js.Any*): DatabaseUpdateCommand = js.native
  
  def remove(): DatabaseUpdateCommand = js.native
  
  def rename(`val`: String): DatabaseUpdateCommand = js.native
  
  def set(`val`: js.Any): DatabaseUpdateCommand = js.native
  
  def shift(): DatabaseUpdateCommand = js.native
  
  def size(`val`: Double): DatabaseQueryCommand = js.native
  
  def unshift(values: js.Any*): DatabaseUpdateCommand = js.native
}
object DatabaseCommand {
  
  @scala.inline
  def apply(
    addToSet: js.Any => DatabaseUpdateCommand,
    aggregate: Abs,
    all: js.Array[_] => DatabaseQueryCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    bit: Double => DatabaseUpdateCommand,
    elemMatch: js.Any => DatabaseQueryCommand,
    eq: js.Any => DatabaseQueryCommand,
    exists: Boolean => DatabaseQueryCommand,
    geoIntersects: IGeoIntersectsCommandOptions => DatabaseQueryCommand,
    geoNear: IGeoNearCommandOptions => DatabaseQueryCommand,
    geoWithin: IGeoWithinCommandOptions => DatabaseQueryCommand,
    gt: js.Any => DatabaseQueryCommand,
    gte: js.Any => DatabaseQueryCommand,
    in: js.Array[_] => DatabaseQueryCommand,
    inc: Double => DatabaseUpdateCommand,
    lt: js.Any => DatabaseQueryCommand,
    lte: js.Any => DatabaseQueryCommand,
    max: Double => DatabaseUpdateCommand,
    min: Double => DatabaseUpdateCommand,
    mod: (Double, Double) => DatabaseQueryCommand,
    mul: Double => DatabaseUpdateCommand,
    neq: js.Any => DatabaseQueryCommand,
    nin: js.Array[_] => DatabaseQueryCommand,
    nor: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    pop: () => DatabaseUpdateCommand,
    project: Slice,
    pull: js.Any => DatabaseUpdateCommand,
    pullAll: js.Any => DatabaseUpdateCommand,
    push: /* repeated */ js.Any => DatabaseUpdateCommand,
    remove: () => DatabaseUpdateCommand,
    rename: String => DatabaseUpdateCommand,
    set: js.Any => DatabaseUpdateCommand,
    shift: () => DatabaseUpdateCommand,
    size: Double => DatabaseQueryCommand,
    unshift: /* repeated */ js.Any => DatabaseUpdateCommand
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal(addToSet = js.Any.fromFunction1(addToSet), aggregate = aggregate.asInstanceOf[js.Any], all = js.Any.fromFunction1(all), and = js.Any.fromFunction1(and), bit = js.Any.fromFunction1(bit), elemMatch = js.Any.fromFunction1(elemMatch), eq = js.Any.fromFunction1(eq), exists = js.Any.fromFunction1(exists), geoIntersects = js.Any.fromFunction1(geoIntersects), geoNear = js.Any.fromFunction1(geoNear), geoWithin = js.Any.fromFunction1(geoWithin), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), inc = js.Any.fromFunction1(inc), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mod = js.Any.fromFunction2(mod), mul = js.Any.fromFunction1(mul), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or), pop = js.Any.fromFunction0(pop), project = project.asInstanceOf[js.Any], pull = js.Any.fromFunction1(pull), pullAll = js.Any.fromFunction1(pullAll), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction0(remove), rename = js.Any.fromFunction1(rename), set = js.Any.fromFunction1(set), shift = js.Any.fromFunction0(shift), size = js.Any.fromFunction1(size), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[DatabaseCommand]
  }
  
  @scala.inline
  implicit class DatabaseCommandOps[Self <: DatabaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddToSet(value: js.Any => DatabaseUpdateCommand): Self = this.set("addToSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAggregate(value: Abs): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: js.Array[_] => DatabaseQueryCommand): Self = this.set("all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBit(value: Double => DatabaseUpdateCommand): Self = this.set("bit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElemMatch(value: js.Any => DatabaseQueryCommand): Self = this.set("elemMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEq(value: js.Any => DatabaseQueryCommand): Self = this.set("eq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExists(value: Boolean => DatabaseQueryCommand): Self = this.set("exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoIntersects(value: IGeoIntersectsCommandOptions => DatabaseQueryCommand): Self = this.set("geoIntersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoNear(value: IGeoNearCommandOptions => DatabaseQueryCommand): Self = this.set("geoNear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoWithin(value: IGeoWithinCommandOptions => DatabaseQueryCommand): Self = this.set("geoWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGt(value: js.Any => DatabaseQueryCommand): Self = this.set("gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGte(value: js.Any => DatabaseQueryCommand): Self = this.set("gte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: js.Array[_] => DatabaseQueryCommand): Self = this.set("in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInc(value: Double => DatabaseUpdateCommand): Self = this.set("inc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLt(value: js.Any => DatabaseQueryCommand): Self = this.set("lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLte(value: js.Any => DatabaseQueryCommand): Self = this.set("lte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: Double => DatabaseUpdateCommand): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: Double => DatabaseUpdateCommand): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMod(value: (Double, Double) => DatabaseQueryCommand): Self = this.set("mod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMul(value: Double => DatabaseUpdateCommand): Self = this.set("mul", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNeq(value: js.Any => DatabaseQueryCommand): Self = this.set("neq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNin(value: js.Array[_] => DatabaseQueryCommand): Self = this.set("nin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNor(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("nor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNot(value: DatabaseLogicCommand => DatabaseLogicCommand): Self = this.set("not", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("or", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => DatabaseUpdateCommand): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProject(value: Slice): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull(value: js.Any => DatabaseUpdateCommand): Self = this.set("pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullAll(value: js.Any => DatabaseUpdateCommand): Self = this.set("pullAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: () => DatabaseUpdateCommand): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRename(value: String => DatabaseUpdateCommand): Self = this.set("rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: js.Any => DatabaseUpdateCommand): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: () => DatabaseUpdateCommand): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double => DatabaseQueryCommand): Self = this.set("size", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnshift(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
}
