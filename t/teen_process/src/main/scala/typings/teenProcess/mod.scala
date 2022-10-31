package typings.teenProcess

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioPipe
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.node.urlMod.URL_
import typings.std.Error
import typings.teenProcess.anon.TeenProcessExecOptionsisB
import typings.teenProcess.teenProcessStrings.`lines-stderr`
import typings.teenProcess.teenProcessStrings.`lines-stdout`
import typings.teenProcess.teenProcessStrings.`stream-line`
import typings.teenProcess.teenProcessStrings.die
import typings.teenProcess.teenProcessStrings.end
import typings.teenProcess.teenProcessStrings.exit
import typings.teenProcess.teenProcessStrings.output
import typings.teenProcess.teenProcessStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teen_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("teen_process", "SubProcess")
  @js.native
  open class SubProcess protected () extends EventEmitter {
    def this(cmd: String) = this()
    def this(cmd: String, args: js.Array[String]) = this()
    def this(cmd: String, args: js.Array[String], opts: SubProcessOptions) = this()
    def this(cmd: String, args: Unit, opts: SubProcessOptions) = this()
    
    def addListener(event: `lines-stdout` | `lines-stderr`, listener: js.Function1[/* lines */ js.Array[String], Unit]): this.type = js.native
    def addListener(
      event: exit | stop | end | die,
      listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_output(event: output, listener: js.Function2[/* stdout */ String, /* stderr */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_streamline(event: `stream-line`, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    var args: js.Array[String] = js.native
    
    var cmd: String = js.native
    
    /*
      * This will only work if the process is created with the `detached` option
      */
    def detachProcess(): Unit = js.native
    
    def emit(event: exit | stop | end | die): Boolean = js.native
    def emit(event: exit | stop | end | die, code: Double): Boolean = js.native
    def emit(event: exit | stop | end | die, code: Double, signal: Signals): Boolean = js.native
    def emit(event: exit | stop | end | die, code: Null, signal: Signals): Boolean = js.native
    def emit(event: `lines-stdout` | `lines-stderr`, lines: js.Array[String]): this.type = js.native
    
    def emitLines(stream: String, lines: js.Array[String]): Unit = js.native
    
    @JSName("emit")
    def emit_output(event: output, stdout: String, stderr: String): this.type = js.native
    @JSName("emit")
    def emit_streamline(event: `stream-line`, line: String): this.type = js.native
    
    var expectingExit: Boolean = js.native
    
    def handleLastLines(): Unit = js.native
    
    val isRunning: Boolean = js.native
    
    /**
      * After the process has been started you can use join() to wait for it to finish on its own.
      * @example
      * await proc.join(); // will throw on exitcode not 0
      * await proc.join([0, 1]); // will throw on exitcode not 0 or 1
      */
    def join(): js.Promise[Double] = js.native
    def join(allowedExitCodes: js.Array[Double]): js.Promise[Double] = js.native
    
    def on(event: `lines-stdout` | `lines-stderr`, listener: js.Function1[/* lines */ js.Array[String], Unit]): this.type = js.native
    def on(
      event: exit | stop | end | die,
      listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_output(event: output, listener: js.Function2[/* stdout */ String, /* stderr */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_streamline(event: `stream-line`, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    def once(event: `lines-stdout` | `lines-stderr`, listener: js.Function1[/* lines */ js.Array[String], Unit]): this.type = js.native
    def once(
      event: exit | stop | end | die,
      listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_output(event: output, listener: js.Function2[/* stdout */ String, /* stderr */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_streamline(event: `stream-line`, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    var opts: SubProcessOptions = js.native
    
    /**
      * Returns the process identifier (PID) of the child process.
      *  If the child process hasn't started, then the value is `null`.
      */
    val pid: js.UndefOr[Double | Null] = js.native
    
    def prependListener(event: `lines-stdout` | `lines-stderr`, listener: js.Function1[/* lines */ js.Array[String], Unit]): this.type = js.native
    def prependListener(
      event: exit | stop | end | die,
      listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_output(event: output, listener: js.Function2[/* stdout */ String, /* stderr */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_streamline(event: `stream-line`, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    def prependOnceListener(event: `lines-stdout` | `lines-stderr`, listener: js.Function1[/* lines */ js.Array[String], Unit]): this.type = js.native
    def prependOnceListener(
      event: exit | stop | end | die,
      listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_output(event: output, listener: js.Function2[/* stdout */ String, /* stderr */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_streamline(event: `stream-line`, listener: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    var proc: ChildProcess | Null = js.native
    
    var rep: String = js.native
    
    /**
      * spawn the subprocess and return control whenever we deem that it has fully "started".
      * @param startDetector - Lets SubProcess know when to return control from `start()`.
      * If a number, SubProcess will wait that number of milliseconds.
      * If a function, SubProcess will wait until it returns true.
      * Defaults to wait until there is some output.
      * @param timeoutMs - Maximum time to wait for a process to start, in milliseconds.
      */
    def start(): js.Promise[Unit] = js.native
    def start(detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean]): js.Promise[Unit] = js.native
    def start(startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean], detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean], timeoutMs: Double): js.Promise[Unit] = js.native
    def start(
      startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean],
      timeoutMs: Double,
      detach: Boolean
    ): js.Promise[Unit] = js.native
    def start(
      startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean],
      timeoutMs: Null,
      detach: Boolean
    ): js.Promise[Unit] = js.native
    def start(
      startDetector: js.Function2[/* stdout */ String, /* stderr */ String, Boolean],
      timeoutMs: Unit,
      detach: Boolean
    ): js.Promise[Unit] = js.native
    def start(startDetector: Double): js.Promise[Unit] = js.native
    def start(startDetector: Double, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Double, timeoutMs: Double): js.Promise[Unit] = js.native
    def start(startDetector: Double, timeoutMs: Double, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Double, timeoutMs: Null, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Double, timeoutMs: Unit, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Null, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Null, timeoutMs: Double): js.Promise[Unit] = js.native
    def start(startDetector: Null, timeoutMs: Double, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Null, timeoutMs: Null, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Null, timeoutMs: Unit, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Unit, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Unit, timeoutMs: Double): js.Promise[Unit] = js.native
    def start(startDetector: Unit, timeoutMs: Double, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Unit, timeoutMs: Null, detach: Boolean): js.Promise[Unit] = js.native
    def start(startDetector: Unit, timeoutMs: Unit, detach: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Kills the process.
      * @param signal - Custom signal instead of the default 'SIGTERM'.
      * @param timeout - If your process might not be killable and you don't really care, you can also pass a timeout,
      * which will return control to you in the form of an error after the timeout has passed.
      */
    def stop(): js.Promise[Double] = js.native
    def stop(signal: Double): js.Promise[Double] = js.native
    def stop(signal: Double, timeout: Double): js.Promise[Double] = js.native
    def stop(signal: Unit, timeout: Double): js.Promise[Double] = js.native
    def stop(signal: Signals): js.Promise[Double] = js.native
    def stop(signal: Signals, timeout: Double): js.Promise[Double] = js.native
  }
  
  inline def exec(cmd: String): js.Promise[TeenProcessExecResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TeenProcessExecResult[String]]]
  inline def exec(cmd: String, args: js.Array[String]): js.Promise[TeenProcessExecResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TeenProcessExecResult[String]]]
  inline def exec(cmd: String, args: js.Array[String], opts: TeenProcessExecOptionsisB): js.Promise[TeenProcessExecResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TeenProcessExecResult[Buffer]]]
  inline def exec(cmd: String, args: js.Array[String], opts: TeenProcessExecOptions): js.Promise[TeenProcessExecResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TeenProcessExecResult[String]]]
  inline def exec(cmd: String, args: Unit, opts: TeenProcessExecOptionsisB): js.Promise[TeenProcessExecResult[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TeenProcessExecResult[Buffer]]]
  inline def exec(cmd: String, args: Unit, opts: TeenProcessExecOptions): js.Promise[TeenProcessExecResult[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TeenProcessExecResult[String]]]
  
  // overloads of spawn with 'args'
  inline def spawn(command: String): ChildProcessWithoutNullStreams = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Null, Null, Null]]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Null, Null, Null]]
  inline def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  
  trait ExecError
    extends StObject
       with Error {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var stderr: String
    
    var stdout: String
  }
  object ExecError {
    
    inline def apply(message: String, name: String, stderr: String, stdout: String): ExecError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecError]
    }
    
    extension [Self <: ExecError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubProcessOptions
    extends StObject
       with SpawnOptions {
    
    var encoding: js.UndefOr[String] = js.undefined
  }
  object SubProcessOptions {
    
    inline def apply(): SubProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubProcessOptions]
    }
    
    extension [Self <: SubProcessOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<node.child_process.SpawnOptions, 'cwd' | 'env' | 'shell'> */
  trait TeenProcessExecOptions extends StObject {
    
    var cwd: js.UndefOr[String | URL_] = js.undefined
    
    /**
      * Character encoding to use when converting `stdout` and `stderr` to a string.
      * Has no effect if `isBuffer` is set to true.
      * @default 'utf8'
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    /**
      * Useful if you have a very chatty process whose output you don't care about and
      * don't want to add it to the memory consumed by your program.
      * @default false
      */
    var ignoreOutput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies that the returned standard I/O is an instance of a Buffer.
      * @default false
      * @example
      * let {stdout, stderr} = await exec('cat', [filename], {isBuffer: true});
      * Buffer.isBuffer(stdout); // true
      */
    var isBuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The signal value to be used when the spawned process will be killed by the abort signal.
      * @default 'SIGTERM'
      */
    var killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    /**
      * Allows stdout and stderr to be sent to a particular logger, as it it received.
      * This is overridden by the `ignoreOutput` option.
      */
    var logger: js.UndefOr[TeenProcessLogger] = js.undefined
    
    /**
      * Maximum size of `stderr` buffer
      * @default 100 * 1024 * 1024 // 100 MB
      */
    var maxStderrBufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum size of `stdout` buffer
      * @default 100 * 1024 * 1024 // 100 MB
      */
    var maxStdoutBufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * If you're on Windows, you'll want to pass `shell: true`, because exec actually uses spawn under the hood,
      * and is therefore subject to the issues noted about Windows + spawn in the Node docs.
      * @see https://nodejs.org/api/child_process.html
      */
    var shell: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * @default 'inherit'
      */
    var stdio: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object TeenProcessExecOptions {
    
    inline def apply(): TeenProcessExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TeenProcessExecOptions]
    }
    
    extension [Self <: TeenProcessExecOptions](x: Self) {
      
      inline def setCwd(value: String | URL_): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setIgnoreOutput(value: Boolean): Self = StObject.set(x, "ignoreOutput", value.asInstanceOf[js.Any])
      
      inline def setIgnoreOutputUndefined: Self = StObject.set(x, "ignoreOutput", js.undefined)
      
      inline def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
      
      inline def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setLogger(value: TeenProcessLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxStderrBufferSize(value: Double): Self = StObject.set(x, "maxStderrBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxStderrBufferSizeUndefined: Self = StObject.set(x, "maxStderrBufferSize", js.undefined)
      
      inline def setMaxStdoutBufferSize(value: Double): Self = StObject.set(x, "maxStdoutBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxStdoutBufferSizeUndefined: Self = StObject.set(x, "maxStdoutBufferSize", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setStdio(value: String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait TeenProcessExecResult[T /* <: String | Buffer */] extends StObject {
    
    /** Exit code */
    var code: Double
    
    /** Stderr */
    var stderr: T
    
    /** Stdout */
    var stdout: T
  }
  object TeenProcessExecResult {
    
    inline def apply[T /* <: String | Buffer */](code: Double, stderr: T, stdout: T): TeenProcessExecResult[T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeenProcessExecResult[T]]
    }
    
    extension [Self <: TeenProcessExecResult[?], T /* <: String | Buffer */](x: Self & TeenProcessExecResult[T]) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: T): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: T): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeenProcessLogger extends StObject {
    
    def debug(args: Any*): Unit
  }
  object TeenProcessLogger {
    
    inline def apply(debug: /* repeated */ Any => Unit): TeenProcessLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
      __obj.asInstanceOf[TeenProcessLogger]
    }
    
    extension [Self <: TeenProcessLogger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    }
  }
}
