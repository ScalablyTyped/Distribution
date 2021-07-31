package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docsExamplesMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "fixed")
  @js.native
  val fixed: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <div\n    style={{\n      overflow: 'hidden',\n      position: 'relative',\n      border: '1px solid black',\n    }}\n  >\n    <div\n    style={{\n      overflow: 'auto',\n      height: '100px',\n      zIndex: '15',\n    }}\n  >\n    <ul>\n      <li>item</li>\n      <Popover flip={false} fixed={true} zIndex={1} shown={shown} onClick={() => setShown(!shown)} placement=\"top\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n    </ul>\n  </div>\n  </div>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "flip")
  @js.native
  val flip: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <div\n   \n    style={{\n      overflow: 'hidden',\n      position: 'relative',\n      border: '1px solid black',\n    }}\n  >\n    <div\n    style={{\n      overflow: 'auto',\n      height: '100px',\n      zIndex: '15',\n    }}\n  >\n    <ul>\n      <li>item</li>\n      <Popover flip={true} fixed={false} zIndex={1} shown={shown} onClick={() => setShown(!shown)} placement=\"top\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n    </ul>\n  </div>\n  </div>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "fluid")
  @js.native
  val fluid: /* "\n() => {\n  return (\n  <div style={{ display: 'flex'}}>\n    <div style={{ width: '50%', border: '1px solid black'}} >\n      <Popover shown placement=\"top\" showArrow>\n        <Popover.Element><ButtonNext style={{ width: '100%' }}>inline</ButtonNext></Popover.Element>\n        <Popover.Content>The content</Popover.Content>\n      </Popover>\n    </div>\n    <div style={{ width: '50%', border: '1px solid black', marginLeft: '15px'}} >\n      <Popover shown placement=\"top\" showArrow fluid>\n        <Popover.Element><ButtonNext style={{ width: '100%' }}>fluid</ButtonNext></Popover.Element>\n        <Popover.Content>The content</Popover.Content>\n      </Popover>\n    </div>\n  </div>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "moveBy")
  @js.native
  val moveBy: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <Popover shown={shown} onClick={() => setShown(!shown)} moveBy={{ x: 50, y: 100 }} placement=\"right\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "placement")
  @js.native
  val placement: /* "\n() => {\n  const [placement, setPlacement] = React.useState(0);\n  const VALID_PLACEMENTS =  ['auto-start'\n  , 'auto'\n  , 'auto-end'\n  , 'top-start'\n  , 'top'\n  , 'top-end'\n  , 'right-start'\n  , 'right'\n  , 'right-end'\n  , 'bottom-end'\n  , 'bottom'\n  , 'bottom-start'\n  , 'left-end'\n  , 'left'\n  , 'left-start' ]\n\n  React.useEffect(() => {\n    setTimeout(() => setPlacement((placement + 1) % VALID_PLACEMENTS.length), 1000)\n  }, [placement])\n\n  return (\n    <Popover shown flip={false} placement={VALID_PLACEMENTS[placement]} showArrow>\n      <Popover.Element><div style={{ width: '100px', height: '50px',  backgroundColor: 'lightgray'}}/></Popover.Element>\n      <Popover.Content>{VALID_PLACEMENTS[placement]}</Popover.Content>\n    </Popover>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "predicate")
  @js.native
  val predicate: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <div data-hook=\"hello\" style={{ padding: '15px', overflow: 'hidden', position: 'relative', border: '1px solid black' }}>\n      <div\n      style={{\n        overflow: 'hidden',\n        position: 'relative',\n        border: '1px solid black',\n      }}\n    >\n      <div\n      style={{\n        overflow: 'auto',\n        height: '100px',\n        zIndex: '15',\n      }}\n    >\n      <ul>\n        <li>item</li>\n        <Popover \n            appendTo={elm => elm.getAttribute('data-hook') === 'hello'} \n            shown={shown} onClick={() => setShown(!shown)} \n            placement=\"right\" \n            showArrow\n        >\n        <Popover.Element>The Element</Popover.Element>\n        <Popover.Content>The content</Popover.Content>\n      </Popover>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n        <li>item</li>\n      </ul>\n    </div>\n    </div>\n  </div>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "scrollParent")
  @js.native
  val scrollParent: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <div\n    style={{\n      overflow: 'hidden',\n      position: 'relative',\n      border: '1px solid black',\n    }}\n  >\n    <div\n    style={{\n      overflow: 'auto',\n      height: '100px',\n      zIndex: '15',\n    }}\n  >\n    <ul>\n      <li>item</li>\n      <Popover zIndex={1} appendTo=\"scrollParent\" shown={shown} onClick={() => setShown(!shown)} placement=\"right\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n      <li>item</li>\n    </ul>\n  </div>\n  </div>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "simple")
  @js.native
  val simple: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <Popover shown={shown} onClick={() => setShown(!shown)} placement=\"top\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "viewPort")
  @js.native
  val viewPort: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <Popover appendTo=\"viewport\" shown={shown} onClick={() => setShown(!shown)} placement=\"top\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>I am attached to viewport</Popover.Content>\n    </Popover> \n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "window")
  @js.native
  val window: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <Popover appendTo=\"window\" shown={shown} onClick={() => setShown(!shown)} placement=\"right\" showArrow>\n      <Popover.Element>The Element</Popover.Element>\n      <Popover.Content>The content</Popover.Content>\n    </Popover>\n  )\n}\n" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/examples", "zIndex")
  @js.native
  val zIndex: /* "\n() => {\n  const [shown, setShown] = React.useState(true)\n  return (\n    <div>\n    <div style={{ display: 'flex' }}>\n      <div style={{ display: 'block', position: 'relative', width: '50%', marginRight: '30px', height: '50px' }}>\n        <div style={{ position: 'absolute', top: '10px', left: '0px' }}>\n          <Popover\n            shown={shown}\n            flip={false}\n            fixed={true}\n            onClick={() => setShown(!shown)}\n            placement=\"top\"\n          >\n            <Popover.Element>The Element</Popover.Element>\n            <Popover.Content>zIndex 1000</Popover.Content>\n          </Popover>\n        </div>\n        <div\n          style={{\n            zIndex: 2000,\n            position: 'absolute',\n            top: '0px',\n            left: '0px',\n            backgroundColor: 'lightgray',\n            width: '150px',\n            height: '50px',\n          }}\n        >\n        zIndex 2000\n        </div>\n      </div>\n      <div style={{ display: 'block', position: 'relative', width: '50%', height: '50px' }}>\n        <div style={{ position: 'absolute', top: '10px', left: '0px' }}>\n          <Popover\n            shown={shown}\n            zIndex={3000}\n            flip={false}\n            fixed={true}\n            onClick={() => setShown(!shown)}\n            placement=\"top\"\n          >\n            <Popover.Element>The Element</Popover.Element>\n            <Popover.Content>zIndex 3000</Popover.Content>\n          </Popover>\n        </div>\n        <div\n          style={{\n            zIndex: 2000,\n            position: 'absolute',\n            top: '0px',\n            left: '0px',\n            backgroundColor: 'lightgray',\n            width: '150px',\n            height: '50px',\n          }}\n        >\n          zIndex 2000\n        </div>\n      </div>\n    </div>\n  </div>\n  )\n\n}\n" */ String = js.native
}
