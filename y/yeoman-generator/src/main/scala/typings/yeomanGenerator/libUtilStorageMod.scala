package typings.yeomanGenerator

import typings.memFsEditor.mod.Editor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilStorageMod {
  
  /**
    * Storage instances handle a json file where Generator authors can store data.
    *
    * The {@link Generator `Generator`} class instantiates the storage named {@link Generator.config `config`} by default.
    */
  @JSImport("yeoman-generator/lib/util/storage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Storage {
    /**
      * Initializes a new instance of the {@link Storage `Storage`} class.
      *
      * @param name The name of the new storage (this is a namespace).
      * @param fs A mem-fs editor instance.
      * @param configPath The filepath used as a storage.
      * @param options Storage options.
      */
    def this(name: String, fs: Editor, configPath: String) = this()
    def this(name: String, fs: Editor, configPath: String, options: StorageOptions) = this()
    
    /**
      * Creates a proxy object.
      */
    /* CompleteClass */
    override def createProxy(): js.Object = js.native
    
    /**
      * Creates a child storage.
      *
      * @param path The relative property-path of the key to create a new storage.
      */
    /* CompleteClass */
    override def createStorage(path: String): Storage = js.native
    
    /**
      * Recreates the store with {@link defaults `defaults`} value and schedules a save. If keys already exist, the initial value is kept.
      *
      * @param defaults The key-value object to store.
      */
    /* CompleteClass */
    override def defaults(defaults: Record[String, Any]): Record[String, Any] = js.native
    
    /**
      * Deletes a key from the store and schedules a save.
      *
      * @param key The key under which the value is stored.
      */
    /* CompleteClass */
    override def delete(key: String): Unit = js.native
    
    /**
      * Gets a stored value
      *
      * @param key The key under which the value is stored.
      */
    /* CompleteClass */
    override def get(key: String): Any = js.native
    
    /**
      * Gets all the stored values.
      */
    /* CompleteClass */
    override def getAll(): Record[String, Any] = js.native
    
    /**
      * Gets a stored value from a property-path.
      *
      * @param path The property-path under which the value is stored.
      */
    /* CompleteClass */
    override def getPath(path: String): Any = js.native
    
    /**
      * Merges the specified {@link content `content`} into the storage.
      *
      * @param content
      * The content to merge into the storage.
      *
      * @returns
      * The content of the storage.
      */
    /* CompleteClass */
    override def merge(content: Record[String, Any]): Record[String, Any] = js.native
    
    /**
      * Saves a new object of values.
      */
    /* CompleteClass */
    override def save(): Unit = js.native
    
    /**
      * Assigns a key to a value and schedules a save.
      *
      * @param key The key under which the value is stored.
      * @param value Any valid JSON type value.
      */
    /* CompleteClass */
    override def set[T /* <: Any */](key: String, value: T): T = js.native
    
    /**
      * Assigns a lodash path to a value and schedules a save.
      *
      * @param path The property-path under which the value is stored.
      * @param value Any valid JSON type value.
      */
    /* CompleteClass */
    override def setPath[T /* <: Any */](path: String, value: T): T = js.native
  }
  
  /**
    * Storage instances handle a json file where Generator authors can store data.
    *
    * The {@link Generator `Generator`} class instantiates the storage named {@link Generator.config `config`} by default.
    */
  trait Storage extends StObject {
    
    /**
      * Creates a proxy object.
      */
    def createProxy(): js.Object
    
    /**
      * Creates a child storage.
      *
      * @param path The relative property-path of the key to create a new storage.
      */
    def createStorage(path: String): Storage
    
    /**
      * Recreates the store with {@link defaults `defaults`} value and schedules a save. If keys already exist, the initial value is kept.
      *
      * @param defaults The key-value object to store.
      */
    def defaults(defaults: Record[String, Any]): Record[String, Any]
    
    /**
      * Deletes a key from the store and schedules a save.
      *
      * @param key The key under which the value is stored.
      */
    def delete(key: String): Unit
    
    /**
      * Gets a stored value
      *
      * @param key The key under which the value is stored.
      */
    def get(key: String): Any
    
    /**
      * Gets all the stored values.
      */
    def getAll(): Record[String, Any]
    
    /**
      * Gets a stored value from a property-path.
      *
      * @param path The property-path under which the value is stored.
      */
    def getPath(path: String): Any
    
    /**
      * Merges the specified {@link content `content`} into the storage.
      *
      * @param content
      * The content to merge into the storage.
      *
      * @returns
      * The content of the storage.
      */
    def merge(content: Record[String, Any]): Record[String, Any]
    
    /**
      * Saves a new object of values.
      */
    def save(): Unit
    
    /**
      * Assigns a key to a value and schedules a save.
      *
      * @param key The key under which the value is stored.
      * @param value Any valid JSON type value.
      */
    def set[T /* <: Any */](key: String, value: T): T
    
    /**
      * Assigns a lodash path to a value and schedules a save.
      *
      * @param path The property-path under which the value is stored.
      * @param value Any valid JSON type value.
      */
    def setPath[T /* <: Any */](path: String, value: T): T
  }
  object Storage {
    
    inline def apply(
      createProxy: () => js.Object,
      createStorage: String => Storage,
      defaults: Record[String, Any] => Record[String, Any],
      delete: String => Unit,
      get: String => Any,
      getAll: () => Record[String, Any],
      getPath: String => Any,
      merge: Record[String, Any] => Record[String, Any],
      save: () => Unit,
      set: (String, Any) => Any,
      setPath: (String, Any) => Any
    ): Storage = {
      val __obj = js.Dynamic.literal(createProxy = js.Any.fromFunction0(createProxy), createStorage = js.Any.fromFunction1(createStorage), defaults = js.Any.fromFunction1(defaults), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), getPath = js.Any.fromFunction1(getPath), merge = js.Any.fromFunction1(merge), save = js.Any.fromFunction0(save), set = js.Any.fromFunction2(set), setPath = js.Any.fromFunction2(setPath))
      __obj.asInstanceOf[Storage]
    }
    
    extension [Self <: Storage](x: Self) {
      
      inline def setCreateProxy(value: () => js.Object): Self = StObject.set(x, "createProxy", js.Any.fromFunction0(value))
      
      inline def setCreateStorage(value: String => Storage): Self = StObject.set(x, "createStorage", js.Any.fromFunction1(value))
      
      inline def setDefaults(value: Record[String, Any] => Record[String, Any]): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: () => Record[String, Any]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      inline def setGetPath(value: String => Any): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
      
      inline def setMerge(value: Record[String, Any] => Record[String, Any]): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetPath(value: (String, Any) => Any): Self = StObject.set(x, "setPath", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Provides options for the {@link Storage `Storage`} class.
    */
  trait StorageOptions extends StObject {
    
    /**
      * A value indicating whether json object cache should be disabled.
      */
    var disableCache: Boolean
    
    /**
      * A value indicating whether the cache should not be cleaned after each fs change.
      */
    var disableCacheByFile: Boolean
    
    /**
      * A value indicating whether the name should be treated as a lodash path.
      */
    var lodashPath: Boolean
  }
  object StorageOptions {
    
    inline def apply(disableCache: Boolean, disableCacheByFile: Boolean, lodashPath: Boolean): StorageOptions = {
      val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], disableCacheByFile = disableCacheByFile.asInstanceOf[js.Any], lodashPath = lodashPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageOptions]
    }
    
    extension [Self <: StorageOptions](x: Self) {
      
      inline def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
      
      inline def setDisableCacheByFile(value: Boolean): Self = StObject.set(x, "disableCacheByFile", value.asInstanceOf[js.Any])
      
      inline def setLodashPath(value: Boolean): Self = StObject.set(x, "lodashPath", value.asInstanceOf[js.Any])
    }
  }
}
