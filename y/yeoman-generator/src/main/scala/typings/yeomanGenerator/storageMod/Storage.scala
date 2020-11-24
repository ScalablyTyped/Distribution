package typings.yeomanGenerator.storageMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Storage instances handle a json file where Generator authors can store data.
  *
  * The `Generator` class instantiate the storage named `config` by default.
  */
@js.native
trait Storage extends js.Object {
  
  /**
    * Creates a proxy object.
    */
  def createProxy(): js.Object = js.native
  
  /**
    * Creates a child storage.
    *
    * @param path The relative property-path of the key to create a new storage.
    */
  def createStorage(path: String): Storage = js.native
  
  /**
    * Recreates the store with `defaults` value and schedules a save. If keys already exist, the initial value is kept.
    *
    * @param defaults The key-value object to store.
    */
  def defaults(defaults: Record[String, _]): Record[String, _] = js.native
  
  /**
    * Deletes a key from the store and schedules a save.
    *
    * @param key The key under which the value is stored.
    */
  def delete(key: String): Unit = js.native
  
  /**
    * Gets a stored value
    *
    * @param key The key under which the value is stored.
    */
  def get(key: String): js.Any = js.native
  
  /**
    * Gets all the stored values.
    */
  def getAll(): Record[String, _] = js.native
  
  /**
    * Gets a stored value from a property-path.
    *
    * @param path The property-path under which the value is stored.
    */
  def getPath(path: String): js.Any = js.native
  
  /**
    * Saves a new object of values.
    */
  def save(): Unit = js.native
  
  /**
    * Assigns a key to a value and schedules a save.
    *
    * @param key The key under which the value is stored.
    * @param value Any valid JSON type value.
    */
  def set[T /* <: js.Any */](key: String, value: T): T = js.native
  
  /**
    * Assigns a lodash path to a value and schedules a save.
    *
    * @param path The property-path under which the value is stored.
    * @param value Any valid JSON type value.
    */
  def setPath[T /* <: js.Any */](path: String, value: T): T = js.native
}
object Storage {
  
  @scala.inline
  def apply(
    createProxy: () => js.Object,
    createStorage: String => Storage,
    defaults: Record[String, _] => Record[String, _],
    delete: String => Unit,
    get: String => js.Any,
    getAll: () => Record[String, _],
    getPath: String => js.Any,
    save: () => Unit,
    set: (String, js.Any) => js.Any,
    setPath: (String, js.Any) => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(createProxy = js.Any.fromFunction0(createProxy), createStorage = js.Any.fromFunction1(createStorage), defaults = js.Any.fromFunction1(defaults), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), getPath = js.Any.fromFunction1(getPath), save = js.Any.fromFunction0(save), set = js.Any.fromFunction2(set), setPath = js.Any.fromFunction2(setPath))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    
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
    def setCreateProxy(value: () => js.Object): Self = this.set("createProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateStorage(value: String => Storage): Self = this.set("createStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaults(value: Record[String, _] => Record[String, _]): Self = this.set("defaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAll(value: () => Record[String, _]): Self = this.set("getAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: String => js.Any): Self = this.set("getPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPath(value: (String, js.Any) => js.Any): Self = this.set("setPath", js.Any.fromFunction2(value))
  }
}
