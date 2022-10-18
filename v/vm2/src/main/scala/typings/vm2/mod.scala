package typings.vm2

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.vm2.anon.ColumnOffset
import typings.vm2.anon.Compiler
import typings.vm2.anon.Filename
import typings.vm2.anon.Modules
import typings.vm2.anon.`0`
import typings.vm2.vm2Strings.coffeescript
import typings.vm2.vm2Strings.commonjs
import typings.vm2.vm2Strings.host
import typings.vm2.vm2Strings.inherit
import typings.vm2.vm2Strings.javascript
import typings.vm2.vm2Strings.none
import typings.vm2.vm2Strings.off
import typings.vm2.vm2Strings.redirect
import typings.vm2.vm2Strings.sandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vm2.mod.VM because Inheritance from two classes. Inlined sandbox, timeout, run, run, run, run, run, run, runFile, setGlobals, setGlobal, getGlobal, freeze, freeze, readonly, protect, protect */ @JSImport("vm2", "NodeVM")
  @js.native
  open class NodeVM () extends EventEmitter {
    def this(options: NodeVMOptions) = this()
    
    /** Freezes the object inside VM making it read-only. Not available for primitive values. */
    def freeze(`object`: Any): Any = js.native
    def freeze(`object`: Any, name: String): Any = js.native
    
    /** Get the global object with the specific name */
    def getGlobal(name: String): Any = js.native
    
    /** Protects the object inside VM making impossible to set functions as it's properties. Not available for primitive values */
    def protect(`object`: Any): Any = js.native
    def protect(`object`: Any, name: String): Any = js.native
    
    /** Freezes the object inside VM making it read-only. Not available for primitive values. */
    def readonly(`object`: Any): Any = js.native
    
    /** Require a module in VM and return it's exports. */
    def require(module: String): Any = js.native
    
    /** Runs the code */
    def run(js_ : String): Any = js.native
    def run(js_ : String, options: String): Any = js.native
    def run(js_ : String, options: Filename): Any = js.native
    def run(js_ : VMScript): Any = js.native
    def run(js_ : VMScript, options: String): Any = js.native
    def run(js_ : VMScript, options: Filename): Any = js.native
    def run(script: String, options: `0`): Any = js.native
    def run(script: VMScript, options: `0`): Any = js.native
    
    /** Runs the code in the specific file */
    def runFile(filename: String): Any = js.native
    
    /** Direct access to the global sandbox object */
    val sandbox: Any = js.native
    
    /** Make a object visible as a global with a specific name */
    def setGlobal(name: String, value: Any): this.type = js.native
    
    /** Loads all the values into the global object with the same names */
    def setGlobals(values: Any): this.type = js.native
    
    /** Only here because of implements VM. Does nothing. */
    var timeout: js.UndefOr[Double] = js.native
  }
  /* static members */
  object NodeVM {
    
    @JSImport("vm2", "NodeVM")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create NodeVM and run code inside it.
      *
      * @param {string} script JavaScript code.
      * @param {string} [filename] File name (used in stack traces only).
      * @param {Object} [options] VM options.
      */
    inline def code(script: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(script.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def code(script: String, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(script.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def code(script: String, filename: String, options: NodeVMOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(script.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def code(script: String, filename: Unit, options: NodeVMOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(script.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Create NodeVM and run script from file inside it.
      *
      * @param {string} [filename] File name (used in stack traces only).
      * @param {Object} [options] VM options.
      */
    inline def file(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def file(filename: String, options: NodeVMOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("vm2", "VM")
  @js.native
  open class VM () extends StObject {
    def this(options: VMOptions) = this()
    
    /** Freezes the object inside VM making it read-only. Not available for primitive values. */
    def freeze(`object`: Any): Any = js.native
    def freeze(`object`: Any, name: String): Any = js.native
    
    /** Get the global object with the specific name */
    def getGlobal(name: String): Any = js.native
    
    /** Protects the object inside VM making impossible to set functions as it's properties. Not available for primitive values */
    def protect(`object`: Any): Any = js.native
    def protect(`object`: Any, name: String): Any = js.native
    
    /** Freezes the object inside VM making it read-only. Not available for primitive values. */
    def readonly(`object`: Any): Any = js.native
    
    /** Runs the code */
    def run(script: String): Any = js.native
    def run(script: String, options: String): Any = js.native
    def run(script: String, options: `0`): Any = js.native
    def run(script: VMScript): Any = js.native
    def run(script: VMScript, options: String): Any = js.native
    def run(script: VMScript, options: `0`): Any = js.native
    
    /** Runs the code in the specific file */
    def runFile(filename: String): Any = js.native
    
    /** Direct access to the global sandbox object */
    val sandbox: Any = js.native
    
    /** Make a object visible as a global with a specific name */
    def setGlobal(name: String, value: Any): this.type = js.native
    
    /** Loads all the values into the global object with the same names */
    def setGlobals(values: Any): this.type = js.native
    
    /** Timeout to use for the run methods */
    var timeout: js.UndefOr[Double] = js.native
  }
  
  @JSImport("vm2", "VMError")
  @js.native
  open class VMError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("vm2", "VMScript")
  @js.native
  open class VMScript protected () extends StObject {
    def this(code: String) = this()
    def this(code: String, options: Compiler) = this()
    def this(code: String, path: String) = this()
    def this(code: String, path: String, options: ColumnOffset) = this()
    
    val code: String = js.native
    
    val columnOffset: Double = js.native
    
    /** Compiles the code. If called multiple times, the code is only compiled once. */
    def compile(): this.type = js.native
    
    val compiler: javascript | coffeescript | CompilerFunction = js.native
    
    val filename: String = js.native
    
    val lineOffset: Double = js.native
    
    /** 
      * Wraps the code 
      * @deprecated
      */
    def wrap(prefix: String, postfix: String): this.type = js.native
  }
  
  /**
    * A custom compiler function for all of the JS that comes
    * into the VM
    */
  type CompilerFunction = js.Function2[/* code */ String, /* filename */ String, String]
  
  trait NodeVMOptions
    extends StObject
       with VMOptions {
    
    /** 
      * Array of arguments passed to `process.argv`. 
    	 * This object will not be copied and the script can change this object. 
      */
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    /** `inherit` to enable console, `redirect` to redirect to events, `off` to disable console (default: `inherit`). */
    var console: js.UndefOr[inherit | redirect | off] = js.undefined
    
    /** 
      * Environment map passed to `process.env`. 
    	 * This object will not be copied and the script can change this object.
      */
    var env: js.UndefOr[Any] = js.undefined
    
    /** **WARNING**: This should be disabled. It allows to create a NodeVM form within the sandbox which could return any host module.
      * `true` to enable VMs nesting (default: `false`). */
    var nesting: js.UndefOr[Boolean] = js.undefined
    
    /** `true` or an object to enable `require` options (default: `false`). */
    var require: js.UndefOr[Boolean | VMRequire] = js.undefined
    
    /** File extensions that the internal module resolver should accept. */
    var sourceExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Run modules in strict mode. Required modules are always strict. */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /** `commonjs` (default) to wrap script into CommonJS wrapper, `none` to retrieve value returned by the script. */
    var wrapper: js.UndefOr[commonjs | none] = js.undefined
  }
  object NodeVMOptions {
    
    inline def apply(): NodeVMOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeVMOptions]
    }
    
    extension [Self <: NodeVMOptions](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setConsole(value: inherit | redirect | off): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setNesting(value: Boolean): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setNestingUndefined: Self = StObject.set(x, "nesting", js.undefined)
      
      inline def setRequire(value: Boolean | VMRequire): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setSourceExtensions(value: js.Array[String]): Self = StObject.set(x, "sourceExtensions", value.asInstanceOf[js.Any])
      
      inline def setSourceExtensionsUndefined: Self = StObject.set(x, "sourceExtensions", js.undefined)
      
      inline def setSourceExtensionsVarargs(value: String*): Self = StObject.set(x, "sourceExtensions", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setWrapper(value: commonjs | none): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait VMOptions extends StObject {
    
    /**
      * If set to `false` any attempt to run code using async will throw a `VMError` (default: `true`).
      */
    var allowAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `javascript` (default) or `coffeescript` or custom compiler function (which receives the code, and it's file path).
      *  The library expects you to have coffee-script pre-installed if the compiler is set to `coffeescript`.
      */
    var compiler: js.UndefOr[javascript | coffeescript | CompilerFunction] = js.undefined
    
    /**
      * If set to `false` any calls to eval or function constructors (`Function`, `GeneratorFunction`, etc.) will throw an
      * `EvalError` (default: `true`).
      */
    var eval: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true` any attempt to run code using async will throw a `VMError` (default: `false`).
      * @deprecated Use `allowAsync` instead.
      */
    var fixAsync: js.UndefOr[Boolean] = js.undefined
    
    /** VM's global object. */
    var sandbox: js.UndefOr[Any] = js.undefined
    
    /**
      * Script timeout in milliseconds.  Timeout is only effective on code you run through `run`.
      * Timeout is NOT effective on any method returned by VM.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to `false` any attempt to compile a WebAssembly module will throw a `WebAssembly.CompileError` (default: `true`).
      */
    var wasm: js.UndefOr[Boolean] = js.undefined
  }
  object VMOptions {
    
    inline def apply(): VMOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VMOptions]
    }
    
    extension [Self <: VMOptions](x: Self) {
      
      inline def setAllowAsync(value: Boolean): Self = StObject.set(x, "allowAsync", value.asInstanceOf[js.Any])
      
      inline def setAllowAsyncUndefined: Self = StObject.set(x, "allowAsync", js.undefined)
      
      inline def setCompiler(value: javascript | coffeescript | CompilerFunction): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerFunction2(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "compiler", js.Any.fromFunction2(value))
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setFixAsync(value: Boolean): Self = StObject.set(x, "fixAsync", value.asInstanceOf[js.Any])
      
      inline def setFixAsyncUndefined: Self = StObject.set(x, "fixAsync", js.undefined)
      
      inline def setSandbox(value: Any): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWasm(value: Boolean): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
      
      inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
    }
  }
  
  trait VMRequire extends StObject {
    
    /** Array of allowed built-in modules, accepts ["*"] for all. Using "*" increases the attack surface and potential
      * new modules allow to escape the sandbox. (default: none) */
    var builtin: js.UndefOr[js.Array[String]] = js.undefined
    
    /*
      * `host` (default) to require modules in host and proxy them to sandbox. `sandbox` to load, compile and
      * require modules in sandbox. Built-in modules except `events` always required in host and proxied to sandbox
      */
    var context: js.UndefOr[host | sandbox] = js.undefined
    
    /** Custom require to require host and built-in modules. */
    var customRequire: js.UndefOr[js.Function1[/* id */ String, Any]] = js.undefined
    
    /** `true`, an array of allowed external modules or an object with external options (default: `false`) */
    var external: js.UndefOr[Boolean | js.Array[String] | Modules] = js.undefined
    
    /** Array of modules to be loaded into NodeVM on start. */
    var `import`: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Collection of mock modules (both external or built-in). */
    var mock: js.UndefOr[Any] = js.undefined
    
    /* An additional lookup function in case a module wasn't found in one of the traditional node lookup paths. */
    var resolve: js.UndefOr[
        js.Function2[/* moduleName */ String, /* parentDirname */ String, js.UndefOr[String]]
      ] = js.undefined
    
    /** Restricted path(s) where local modules can be required (default: every path). */
    var root: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Load modules in strict mode. (default: true) */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object VMRequire {
    
    inline def apply(): VMRequire = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VMRequire]
    }
    
    extension [Self <: VMRequire](x: Self) {
      
      inline def setBuiltin(value: js.Array[String]): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      inline def setBuiltinVarargs(value: String*): Self = StObject.set(x, "builtin", js.Array(value*))
      
      inline def setContext(value: host | sandbox): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCustomRequire(value: /* id */ String => Any): Self = StObject.set(x, "customRequire", js.Any.fromFunction1(value))
      
      inline def setCustomRequireUndefined: Self = StObject.set(x, "customRequire", js.undefined)
      
      inline def setExternal(value: Boolean | js.Array[String] | Modules): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
      
      inline def setImport(value: js.Array[String]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
      
      inline def setMock(value: Any): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      inline def setResolve(value: (/* moduleName */ String, /* parentDirname */ String) => js.UndefOr[String]): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setRoot(value: String | js.Array[String]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setRootVarargs(value: String*): Self = StObject.set(x, "root", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
