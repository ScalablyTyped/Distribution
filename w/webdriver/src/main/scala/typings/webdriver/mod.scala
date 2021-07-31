package typings.webdriver

import typings.webdriver.WebDriver.AttachSessionOptions
import typings.webdriver.WebDriver.Client
import typings.webdriver.WebDriver.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webdriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attachToSession(options: AttachSessionOptions): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(
    options: AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: js.Object
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(
    options: AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(
    options: AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(options: AttachSessionOptions, modifier: Unit, proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(
    options: AttachSessionOptions,
    modifier: Unit,
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def attachToSession(
    options: AttachSessionOptions,
    modifier: Unit,
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  
  @scala.inline
  def newSession(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Unit,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Unit,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Unit, modifier: Unit, proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Unit,
    modifier: Unit,
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Unit,
    modifier: Unit,
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Options): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any], proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Options,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Options,
    modifier: js.Function1[/* repeated */ js.Any, js.Any],
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(options: Options, modifier: Unit, proto: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Options,
    modifier: Unit,
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  @scala.inline
  def newSession(
    options: Options,
    modifier: Unit,
    proto: Unit,
    commandWrapper: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], proto.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  
  @scala.inline
  def reloadSession(instance: Client): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
}
