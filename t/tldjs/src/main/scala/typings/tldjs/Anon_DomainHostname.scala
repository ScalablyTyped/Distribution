package typings.tldjs

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainHostname extends js.Object {
  var domain: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getDomain */ js.Any
  ]
  var hostname: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
  ]
  var isIp: Boolean
  var isValid: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof isValid */ js.Any
  ]
  var publicSuffix: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getPublicSuffix */ js.Any
  ]
  var subdomain: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof getSubdomain */ js.Any
  ]
  var tldExists: ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof tldExists */ js.Any
  ]
}

object Anon_DomainHostname {
  @scala.inline
  def apply(
    domain: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getDomain */ js.Any
    ],
    hostname: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
    ],
    isIp: Boolean,
    isValid: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof isValid */ js.Any
    ],
    publicSuffix: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getPublicSuffix */ js.Any
    ],
    subdomain: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof getSubdomain */ js.Any
    ],
    tldExists: ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof tldExists */ js.Any
    ]
  ): Anon_DomainHostname = {
    val __obj = js.Dynamic.literal(domain = domain, hostname = hostname, isIp = isIp, isValid = isValid, publicSuffix = publicSuffix, subdomain = subdomain, tldExists = tldExists)
  
    __obj.asInstanceOf[Anon_DomainHostname]
  }
}

