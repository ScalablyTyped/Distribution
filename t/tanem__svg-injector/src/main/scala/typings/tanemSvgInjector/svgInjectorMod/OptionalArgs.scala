package typings.tanemSvgInjector.svgInjectorMod

import typings.std.Error
import typings.std.SVGElement
import typings.tanemSvgInjector.typesMod.AfterAll
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[AfterAll] = js.native
  var afterEach: js.UndefOr[Errback] = js.native
  var beforeEach: js.UndefOr[BeforeEach] = js.native
  var evalScripts: js.UndefOr[EvalScripts] = js.native
  var renumerateIRIElements: js.UndefOr[Boolean] = js.native
}

object OptionalArgs {
  @scala.inline
  def apply(): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalArgs]
  }
  @scala.inline
  implicit class OptionalArgsOps[Self <: OptionalArgs] (val x: Self) extends AnyVal {
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
    def setAfterAll(value: /* elementsLoaded */ Double => Unit): Self = this.set("afterAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterAll: Self = this.set("afterAll", js.undefined)
    @scala.inline
    def setAfterEach(value: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = this.set("afterEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    @scala.inline
    def setBeforeEach(value: /* svg */ SVGElement => Unit): Self = this.set("beforeEach", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
    @scala.inline
    def setEvalScripts(value: EvalScripts): Self = this.set("evalScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalScripts: Self = this.set("evalScripts", js.undefined)
    @scala.inline
    def setRenumerateIRIElements(value: Boolean): Self = this.set("renumerateIRIElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenumerateIRIElements: Self = this.set("renumerateIRIElements", js.undefined)
  }
  
}

