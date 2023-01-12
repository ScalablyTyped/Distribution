package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Datastore (Connection) */
trait Datastore extends StObject {
  
  /** A datastore adapter (MySQL, MongoDB, Postgres, etc.) */
  var adapter: Any
  
  /** A list of collections that have been initlized using this datastore */
  var collections: js.Array[String]
  
  /** A instance of the datastore configuration */
  var config: DatastoreConfigInstance
}
object Datastore {
  
  inline def apply(adapter: Any, collections: js.Array[String], config: DatastoreConfigInstance): Datastore = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datastore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datastore] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: Any): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setConfig(value: DatastoreConfigInstance): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
