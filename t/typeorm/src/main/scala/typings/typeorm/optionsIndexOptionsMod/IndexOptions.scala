package typings.typeorm.optionsIndexOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexOptions extends js.Object {
  
  /**
    * Builds the index in the background so that building an index an does not block other database activities.
    * This option is only supported for mongodb database.
    */
  var background: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a time to live, in seconds.
    * This option is only supported for mongodb database.
    */
  var expireAfterSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
    * Works only in MySQL.
    */
  var fulltext: js.UndefOr[Boolean] = js.native
  
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
    * Indicates if this composite index must be unique or not.
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Index filter condition.
    */
  var where: js.UndefOr[String] = js.native
}
object IndexOptions {
  
  @scala.inline
  def apply(): IndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptions]
  }
  
  @scala.inline
  implicit class IndexOptionsOps[Self <: IndexOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setExpireAfterSeconds(value: Double): Self = this.set("expireAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfterSeconds: Self = this.set("expireAfterSeconds", js.undefined)
    
    @scala.inline
    def setFulltext(value: Boolean): Self = this.set("fulltext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulltext: Self = this.set("fulltext", js.undefined)
    
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
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
