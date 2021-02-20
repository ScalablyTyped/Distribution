package typings.waterline.mod

import typings.waterline.waterlineStrings.alter
import typings.waterline.waterlineStrings.drop
import typings.waterline.waterlineStrings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined waterline.waterline.LifecycleCallbacks & {  attributes :waterline.waterline.Attributes | undefined,   connection :string | undefined,   identity :string | undefined,   tableName :string | undefined,   migrate :'alter' | 'drop' | 'safe' | undefined,   schema :boolean | undefined,   types :any | undefined,   datastore :string | undefined,   primaryKey :string | undefined,   dataEncryptionKeys :any | undefined} */
@js.native
trait CollectionDefinition extends StObject {
  
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var attributes: js.UndefOr[Attributes] = js.native
  
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var connection: js.UndefOr[String] = js.native
  
  var dataEncryptionKeys: js.UndefOr[js.Any] = js.native
  
  var datastore: js.UndefOr[String] = js.native
  
  var identity: js.UndefOr[String] = js.native
  
  var migrate: js.UndefOr[alter | drop | safe] = js.native
  
  var primaryKey: js.UndefOr[String] = js.native
  
  var schema: js.UndefOr[Boolean] = js.native
  
  var tableName: js.UndefOr[String] = js.native
  
  var types: js.UndefOr[js.Any] = js.native
}
object CollectionDefinition {
  
  @scala.inline
  def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  
  @scala.inline
  implicit class CollectionDefinitionMutableBuilder[Self <: CollectionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCreateFunction2(value: (/* newlyCreatedRecord */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    @scala.inline
    def setAfterCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterCreate", js.Array(value :_*))
    
    @scala.inline
    def setAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDestroyFunction2(value: (/* destroyedInstance */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterDestroy", js.Array(value :_*))
    
    @scala.inline
    def setAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setAfterUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterUpdate", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setBeforeCreate(
      value: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCreateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeCreate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDestroyFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeDestroy", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeUpdate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeValidateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
    
    @scala.inline
    def setBeforeValidateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeValidate", js.Array(value :_*))
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setDataEncryptionKeys(value: js.Any): Self = StObject.set(x, "dataEncryptionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncryptionKeysUndefined: Self = StObject.set(x, "dataEncryptionKeys", js.undefined)
    
    @scala.inline
    def setDatastore(value: String): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setMigrate(value: alter | drop | safe): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
