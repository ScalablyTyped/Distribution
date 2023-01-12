package typings.webdriverio.anon

import typings.std.NonNullable
import typings.wdioTypes.anon.OmitTestrunnercapabilitie
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapabilities
import typings.webdriverio.webdriverioStrings.`object`
import typings.webdriverio.webdriverioStrings.boolean
import typings.webdriverio.webdriverioStrings.function
import typings.webdriverio.webdriverioStrings.number
import typings.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var default: js.UndefOr[
    (js.Function4[
      /* exitCode */ Double, 
      /* config */ OmitTestrunnercapabilitie, 
      /* capabilities */ RemoteCapabilities, 
      /* results */ Any, 
      Unit
    ]) | (js.Array[
      NonNullable[
        js.UndefOr[
          js.Function4[
            /* exitCode */ Double, 
            /* config */ OmitTestrunnercapabilitie, 
            /* capabilities */ RemoteCapabilities, 
            /* results */ Any, 
            Unit
          ]
        ]
      ]
    ])
  ] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[
        (js.Function4[
          /* exitCode */ Double, 
          /* config */ OmitTestrunnercapabilitie, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* exitCode */ Double, 
                /* config */ OmitTestrunnercapabilitie, 
                /* capabilities */ RemoteCapabilities, 
                /* results */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ], 
      Unit
    ]
  ] = js.undefined
}
object `5` {
  
  inline def apply(`type`: string | number | `object` | boolean | function): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setDefault(
      value: (js.Function4[
          /* exitCode */ Double, 
          /* config */ OmitTestrunnercapabilitie, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* exitCode */ Double, 
                /* config */ OmitTestrunnercapabilitie, 
                /* capabilities */ RemoteCapabilities, 
                /* results */ Any, 
                Unit
              ]
            ]
          ]
        ])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction4(
      value: (/* exitCode */ Double, /* config */ OmitTestrunnercapabilitie, /* capabilities */ RemoteCapabilities, /* results */ Any) => Unit
    ): Self = StObject.set(x, "default", js.Any.fromFunction4(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(
      value: (NonNullable[
          js.UndefOr[
            js.Function4[
              /* exitCode */ Double, 
              /* config */ OmitTestrunnercapabilitie, 
              /* capabilities */ RemoteCapabilities, 
              /* results */ Any, 
              Unit
            ]
          ]
        ])*
    ): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[
          (js.Function4[
            /* exitCode */ Double, 
            /* config */ OmitTestrunnercapabilitie, 
            /* capabilities */ RemoteCapabilities, 
            /* results */ Any, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function4[
                  /* exitCode */ Double, 
                  /* config */ OmitTestrunnercapabilitie, 
                  /* capabilities */ RemoteCapabilities, 
                  /* results */ Any, 
                  Unit
                ]
              ]
            ]
          ])
        ] => Unit
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
