package typings.typeorm.entitySchemaIndexOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySchemaIndexOptions extends js.Object {
  
  /**
    * Index column names.
    */
  var columns: js.UndefOr[
    (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
  ] = js.native
  
  /**
    * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
    * Works only in MySQL.
    */
  var fulltext: js.UndefOr[Boolean] = js.native
  
  /**
    * Index name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Fulltext parser.
    * Works only in MySQL.
    */
  var parser: js.UndefOr[String] = js.native
  
  /**
    * If true, the index only references documents with the specified field.
    * These indexes use less space but behave differently in some situations (particularly sorts).
    * This option is only supported for mongodb database.
    */
  var sparse: js.UndefOr[Boolean] = js.native
  
  /**
    * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
    * Works only in MySQL and PostgreSQL.
    */
  var spatial: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if index must sync with database index.
    */
  var synchronize: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this index must be unique or not.
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Index filter condition.
    */
  var where: js.UndefOr[String] = js.native
}
object EntitySchemaIndexOptions {
  
  @scala.inline
  def apply(): EntitySchemaIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySchemaIndexOptions]
  }
  
  @scala.inline
  implicit class EntitySchemaIndexOptionsOps[Self <: EntitySchemaIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setFulltext(value: Boolean): Self = this.set("fulltext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulltext: Self = this.set("fulltext", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setSpatial(value: Boolean): Self = this.set("spatial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatial: Self = this.set("spatial", js.undefined)
    
    @scala.inline
    def setSynchronize(value: Boolean): Self = this.set("synchronize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronize: Self = this.set("synchronize", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
