package typings.typeorm.joinOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinOptions extends js.Object {
  
  /**
    * Alias of the main entity.
    */
  var alias: String = js.native
  
  /**
    * Array of columns to INNER JOIN.
    */
  var innerJoin: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Array of columns to INNER JOIN.
    */
  var innerJoinAndSelect: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Array of columns to LEFT JOIN.
    */
  var leftJoin: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Array of columns to LEFT JOIN.
    */
  var leftJoinAndSelect: js.UndefOr[StringDictionary[String]] = js.native
}
object JoinOptions {
  
  @scala.inline
  def apply(alias: String): JoinOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
  
  @scala.inline
  implicit class JoinOptionsOps[Self <: JoinOptions] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerJoin(value: StringDictionary[String]): Self = this.set("innerJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerJoin: Self = this.set("innerJoin", js.undefined)
    
    @scala.inline
    def setInnerJoinAndSelect(value: StringDictionary[String]): Self = this.set("innerJoinAndSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerJoinAndSelect: Self = this.set("innerJoinAndSelect", js.undefined)
    
    @scala.inline
    def setLeftJoin(value: StringDictionary[String]): Self = this.set("leftJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftJoin: Self = this.set("leftJoin", js.undefined)
    
    @scala.inline
    def setLeftJoinAndSelect(value: StringDictionary[String]): Self = this.set("leftJoinAndSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftJoinAndSelect: Self = this.set("leftJoinAndSelect", js.undefined)
  }
}
