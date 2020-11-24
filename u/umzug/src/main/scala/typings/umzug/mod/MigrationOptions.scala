package typings.umzug.mod

import typings.std.RegExp
import typings.umzug.anon.Down
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationOptions extends js.Object {
  
  /**
    * A function that maps a file path to a migration object in the form
    * { up: Function, down: Function }. The default for this is to require(...)
    * the file as javascript, but you can use this to transpile TypeScript,
    * read raw sql etc.
    * See https://github.com/sequelize/umzug/tree/master/test/fixtures
    * for examples.
    */
  var customResolver: js.UndefOr[js.Function1[/* path */ String, Down]] = js.native
  
  /*
    * The params that gets passed to the migrations.
    * Might be an array or a synchronous function which returns an array.
    */
  var params: js.UndefOr[js.Array[_]] = js.native
  
  /** The path to the migrations directory. */
  var path: js.UndefOr[String] = js.native
  
  /** The pattern that determines whether or not a file is a migration. */
  var pattern: js.UndefOr[RegExp] = js.native
  
  /**
    * A function that receives and returns the to be executed function.
    * This can be used to modify the function.
    */
  var wrap: js.UndefOr[js.Function1[/* fn */ js.Any, _]] = js.native
}
object MigrationOptions {
  
  @scala.inline
  def apply(): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationOptions]
  }
  
  @scala.inline
  implicit class MigrationOptionsOps[Self <: MigrationOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomResolver(value: /* path */ String => Down): Self = this.set("customResolver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomResolver: Self = this.set("customResolver", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setWrap(value: /* fn */ js.Any => _): Self = this.set("wrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
