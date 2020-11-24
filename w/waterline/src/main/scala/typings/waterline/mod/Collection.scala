package typings.waterline.mod

import typings.waterline.waterlineStrings.alter
import typings.waterline.waterlineStrings.drop
import typings.waterline.waterlineStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined waterline.waterline.CollectionDefinition */
@js.native
trait Collection extends js.Object {
  
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
object Collection {
  
  @scala.inline
  def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    
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
    def setAfterCreateFunction2(value: (/* newlyCreatedRecord */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterCreate", js.Array(value :_*))
    
    @scala.inline
    def setAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
    
    @scala.inline
    def setAfterDestroyFunction2(value: (/* destroyedInstance */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterDestroy", js.Array(value :_*))
    
    @scala.inline
    def setAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterUpdate", js.Array(value :_*))
    
    @scala.inline
    def setAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBeforeCreateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeCreate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCreate(
      value: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCreate: Self = this.set("beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeDestroyFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeDestroy", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeUpdate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeValidateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeValidateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeValidate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setDataEncryptionKeys(value: js.Any): Self = this.set("dataEncryptionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEncryptionKeys: Self = this.set("dataEncryptionKeys", js.undefined)
    
    @scala.inline
    def setDatastore(value: String): Self = this.set("datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastore: Self = this.set("datastore", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setMigrate(value: alter | drop | safe): Self = this.set("migrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrate: Self = this.set("migrate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setSchema(value: Boolean): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Any): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
