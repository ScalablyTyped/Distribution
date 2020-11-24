package typings.webpackServe.mod

import typings.webpackServe.anon.Compiler
import typings.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
@js.native
trait OnOptions extends js.Object {
  
  var `build-finished`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
  
  var `build-started`: js.UndefOr[js.Function1[/* args */ Compiler, Unit]] = js.native
  
  var `compiler-error`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
  
  var `compiler-warning`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
  
  var listening: js.UndefOr[js.Function1[/* args */ typings.webpackServe.anon.Options, Unit]] = js.native
}
object OnOptions {
  
  @scala.inline
  def apply(): OnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnOptions]
  }
  
  @scala.inline
  implicit class OnOptionsOps[Self <: OnOptions] (val x: Self) extends AnyVal {
    
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
    def `setBuild-finished`(value: /* args */ Stats => Unit): Self = this.set("build-finished", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteBuild-finished`: Self = this.set("build-finished", js.undefined)
    
    @scala.inline
    def `setBuild-started`(value: /* args */ Compiler => Unit): Self = this.set("build-started", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteBuild-started`: Self = this.set("build-started", js.undefined)
    
    @scala.inline
    def `setCompiler-error`(value: /* args */ Stats => Unit): Self = this.set("compiler-error", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteCompiler-error`: Self = this.set("compiler-error", js.undefined)
    
    @scala.inline
    def `setCompiler-warning`(value: /* args */ Stats => Unit): Self = this.set("compiler-warning", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteCompiler-warning`: Self = this.set("compiler-warning", js.undefined)
    
    @scala.inline
    def setListening(value: /* args */ typings.webpackServe.anon.Options => Unit): Self = this.set("listening", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteListening: Self = this.set("listening", js.undefined)
  }
}
