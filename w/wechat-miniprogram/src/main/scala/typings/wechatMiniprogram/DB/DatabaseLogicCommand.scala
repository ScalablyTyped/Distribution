package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseLogicCommand extends js.Object {
  def and(expressions: DatabaseLogicCommand*): DatabaseLogicCommand = js.native
  def nor(expressions: DatabaseLogicCommand*): DatabaseLogicCommand = js.native
  def not(expression: DatabaseLogicCommand): DatabaseLogicCommand = js.native
  def or(expressions: DatabaseLogicCommand*): DatabaseLogicCommand = js.native
}

object DatabaseLogicCommand {
  @scala.inline
  def apply(
    and: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    nor: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand,
    not: DatabaseLogicCommand => DatabaseLogicCommand,
    or: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand
  ): DatabaseLogicCommand = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), nor = js.Any.fromFunction1(nor), not = js.Any.fromFunction1(not), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseLogicCommand]
  }
  @scala.inline
  implicit class DatabaseLogicCommandOps[Self <: DatabaseLogicCommand] (val x: Self) extends AnyVal {
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
    def setAnd(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setNor(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = this.set("nor", js.Any.fromFunction1(value))
    @scala.inline
    def setNot(value: DatabaseLogicCommand => DatabaseLogicCommand): Self = this.set("not", js.Any.fromFunction1(value))
    @scala.inline
    def setOr(value: /* repeated */ DatabaseLogicCommand => DatabaseLogicCommand): Self = this.set("or", js.Any.fromFunction1(value))
  }
  
}

