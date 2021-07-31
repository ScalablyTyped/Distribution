package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoCountPreferences extends StObject {
  
  /**
    * An index name hint for the query.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * The limit of documents to count.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  
  /**
    * The number of documents to skip for the count.
    */
  var skip: js.UndefOr[Boolean] = js.undefined
}
object MongoCountPreferences {
  
  @scala.inline
  def apply(): MongoCountPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoCountPreferences]
  }
  
  @scala.inline
  implicit class MongoCountPreferencesMutableBuilder[Self <: MongoCountPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
