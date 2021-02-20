package typings.yeomanGenerator

import typings.memFsEditor.mod.Editor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  /**
    * Storage instances handle a json file where Generator authors can store data.
    *
    * The `Generator` class instantiate the storage named `config` by default.
    */
  @JSImport("yeoman-generator/lib/util/storage", JSImport.Namespace)
  @js.native
  class ^ protected () extends Storage {
    /**
      * Initializes a new instance of the `Storage` class.
      *
      * @param name The name of the new storage (this is a namespace).
      * @param fs A mem-fs editor instance.
      * @param configPath The filepath used as a storage.
      * @param options Storage options.
      */
    def this(name: String, fs: Editor, configPath: String) = this()
    def this(name: String, fs: Editor, configPath: String, options: StorageOptions) = this()
  }
  
  /**
    * Storage instances handle a json file where Generator authors can store data.
    *
    * The `Generator` class instantiate the storage named `config` by default.
    */
  @js.native
  trait Storage extends StObject {
    
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
    implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateProxy(value: () => js.Object): Self = StObject.set(x, "createProxy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateStorage(value: String => Storage): Self = StObject.set(x, "createStorage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaults(value: Record[String, _] => Record[String, _]): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAll(value: () => Record[String, _]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPath(value: String => js.Any): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPath(value: (String, js.Any) => js.Any): Self = StObject.set(x, "setPath", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Provides options for the `Storage` class.
    */
  @js.native
  trait StorageOptions extends StObject {
    
    /**
      * A value indicating whether json object cache should be disabled.
      */
    var disableCache: Boolean = js.native
    
    /**
      * A value indicating whether the cache should not be cleaned after each fs change.
      */
    var disableCacheByFile: Boolean = js.native
    
    /**
      * A value indicating whether the name should be treated as a lodash path.
      */
    var lodashPath: Boolean = js.native
  }
  object StorageOptions {
    
    @scala.inline
    def apply(disableCache: Boolean, disableCacheByFile: Boolean, lodashPath: Boolean): StorageOptions = {
      val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], disableCacheByFile = disableCacheByFile.asInstanceOf[js.Any], lodashPath = lodashPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageOptions]
    }
    
    @scala.inline
    implicit class StorageOptionsMutableBuilder[Self <: StorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCacheByFile(value: Boolean): Self = StObject.set(x, "disableCacheByFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLodashPath(value: Boolean): Self = StObject.set(x, "lodashPath", value.asInstanceOf[js.Any])
    }
  }
}
