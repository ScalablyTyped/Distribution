package typings.typeorm.entitySchemaUniqueOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySchemaUniqueOptions extends js.Object {
  
  /**
    * Unique column names.
    */
  var columns: js.UndefOr[
    (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
  ] = js.native
  
  /**
    * Unique constraint name.
    */
  var name: js.UndefOr[String] = js.native
}
object EntitySchemaUniqueOptions {
  
  @scala.inline
  def apply(): EntitySchemaUniqueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySchemaUniqueOptions]
  }
  
  @scala.inline
  implicit class EntitySchemaUniqueOptionsOps[Self <: EntitySchemaUniqueOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumnsFunction1(value: /* object */ js.UndefOr[js.Any] => js.Array[_] | StringDictionary[Double]): Self = this.set("columns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumns(
      value: (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
