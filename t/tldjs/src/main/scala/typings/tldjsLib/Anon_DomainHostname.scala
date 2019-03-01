package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainHostname extends js.Object {
  var domain: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getDomain */ js.Any
  ]
  var hostname: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
  ]
  var isIp: scala.Boolean
  var isValid: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof isValid */ js.Any
  ]
  var publicSuffix: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getPublicSuffix */ js.Any
  ]
  var subdomain: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getSubdomain */ js.Any
  ]
  var tldExists: stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof tldExists */ js.Any
  ]
}

object Anon_DomainHostname {
  @scala.inline
  def apply(
    domain: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getDomain */ js.Any
    ],
    hostname: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
    ],
    isIp: scala.Boolean,
    isValid: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof isValid */ js.Any
    ],
    publicSuffix: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getPublicSuffix */ js.Any
    ],
    subdomain: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getSubdomain */ js.Any
    ],
    tldExists: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof tldExists */ js.Any
    ]
  ): Anon_DomainHostname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("isIp")(isIp)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("publicSuffix")(publicSuffix)
    __obj.updateDynamic("subdomain")(subdomain)
    __obj.updateDynamic("tldExists")(tldExists)
    __obj.asInstanceOf[Anon_DomainHostname]
  }
}

