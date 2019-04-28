
# Scala.js typings for swagger-express-mw

Typings are for version 0.7

## Library description:
Swagger loader and middleware for express

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-express-mw |
| Keywords           | swagger, api, apis, connect |
| # releases         | 1 |
| # dependents       | 28 |
| # downloads        | 619410 |
| # stars            | 6 |

## Links
- [Homepage](https://github.com/apigee-127/swagger-express#readme)
- [Bugs](https://github.com/apigee-127/swagger-express/issues)
- [Repository](https://github.com/apigee-127/swagger-express)
- [Npm](https://www.npmjs.com/package/swagger-express-mw)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-express-mw 0.7
// Project: https://github.com/apigee-127/swagger-express#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================

import * as SwaggerExpress from "swagger-express-mw";
import * as express from "express";

let app = express();
let config: SwaggerExpress.Config = {
    appRoot: __dirname
};

SwaggerExpress.create(config, (err, middleware) => {
    if (err) {
        throw err; // or handle error
    }
    middleware.register(app);

    const port = process.env.PORT || 10010;
    app.listen(port);
});

 =============================================== */


```

