package typings.wechatMiniprogram.DB

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
    eq: js.Any => DatabaseLogicCommand,
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
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), and = js.Any.fromFunction1(and), elemMatch = js.Any.fromFunction1(elemMatch), eq = js.Any.fromFunction1(eq), exists = js.Any.fromFunction1(exists), geoIntersects = js.Any.fromFunction1(geoIntersects), geoNear = js.Any.fromFunction1(geoNear), geoWithin = js.Any.fromFunction1(geoWithin), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mod = js.Any.fromFunction2(mod), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or), size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  
  @scala.inline
  implicit class DatabaseQueryCommandOps[Self <: DatabaseQueryCommand] (val x: Self) extends AnyVal {
    
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
    def setAll(value: js.Array[_] => DatabaseLogicCommand): Self = this.set("all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElemMatch(value: js.Any => DatabaseLogicCommand): Self = this.set("elemMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEq(value: js.Any => DatabaseLogicCommand): Self = this.set("eq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExists(value: Boolean => DatabaseLogicCommand): Self = this.set("exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoIntersects(value: IGeoIntersectsCommandOptions => DatabaseLogicCommand): Self = this.set("geoIntersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoNear(value: IGeoNearCommandOptions => DatabaseLogicCommand): Self = this.set("geoNear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeoWithin(value: IGeoWithinCommandOptions => DatabaseLogicCommand): Self = this.set("geoWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGt(value: js.Any => DatabaseLogicCommand): Self = this.set("gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGte(value: js.Any => DatabaseLogicCommand): Self = this.set("gte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: js.Array[_] => DatabaseLogicCommand): Self = this.set("in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLt(value: js.Any => DatabaseLogicCommand): Self = this.set("lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLte(value: js.Any => DatabaseLogicCommand): Self = this.set("lte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMod(value: (Double, Double) => DatabaseLogicCommand): Self = this.set("mod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNeq(value: js.Any => DatabaseLogicCommand): Self = this.set("neq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNin(value: js.Array[_] => DatabaseLogicCommand): Self = this.set("nin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double => DatabaseLogicCommand): Self = this.set("size", js.Any.fromFunction1(value))
  }
}
