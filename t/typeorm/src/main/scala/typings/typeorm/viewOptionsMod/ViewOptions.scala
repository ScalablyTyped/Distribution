package typings.typeorm.viewOptionsMod

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends js.Object {
  
  /**
    * View expression.
    */
  var expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]) = js.native
  
  /**
    * Indicates if view is materialized
    */
  var materialized: js.UndefOr[Boolean] = js.native
  
  /**
    * View name.
    */
  var name: String = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(
    expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]),
    name: String
  ): ViewOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
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
    def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[_]): Self = this.set("expression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialized(value: Boolean): Self = this.set("materialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterialized: Self = this.set("materialized", js.undefined)
  }
}
